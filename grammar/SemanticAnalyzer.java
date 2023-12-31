import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends SPLBaseVisitor<Void> {
    private Map<String, Integer> variables;

    public SemanticAnalyzer() {
        variables = new HashMap<>();
    }

    @Override
    public Void visitVarDecl(SPLParser.VarDeclContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        if (variables.containsKey(variableName)) {
            throw new RuntimeException("Variable " + variableName + " already declared.");
        }
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        variables.put(variableName, 0); // Set initial value to 0
        return null;
    }

    @Override
    public Void visitExpression(SPLParser.ExpressionContext ctx) {
        visitAssignment(ctx.assignment());
        checkBooleanConversion(ctx);
        return null;
    }

    private void checkBooleanConversion(SPLParser.ExpressionContext ctx) {
        if (ctx.assignment() != null) {
            SPLParser.AssignmentContext assignment = ctx.assignment();
            if (!isBooleanType(assignment)) {
                throw new RuntimeException("Non-boolean value used in a boolean context.");
            }
        }
    }

    private boolean isBooleanType(SPLParser.AssignmentContext assignment) {
        return isBooleanType(assignment.logic_or());
    }

    private boolean isBooleanType(SPLParser.Logic_orContext logicOr) {
        return isBooleanType(logicOr.logic_and(0));
    }

    private boolean isBooleanType(SPLParser.Logic_andContext logicAnd) {
        return isBooleanType(logicAnd.equality(0));
    }

    private boolean isBooleanType(SPLParser.EqualityContext equality) {
        return isBooleanType(equality.comparison(0));
    }

    private boolean isBooleanType(SPLParser.ComparisonContext comparison) {
        return isBooleanType(comparison.term(0));
    }

    private boolean isBooleanType(SPLParser.TermContext term) {
        return isBooleanType(term.factor(0));
    }

    private boolean isBooleanType(SPLParser.FactorContext factor) {
        return isBooleanType(factor.unary(0));
    }

    private boolean isBooleanType(SPLParser.UnaryContext unary) {
        return unary.NOT() != null || isBooleanType(unary.primary());
    }

    private boolean isBooleanType(SPLParser.PrimaryContext primary) {
        return primary.TRUE() != null || primary.FALSE() != null;
    }


    @Override
    public Void visitTerm(SPLParser.TermContext ctx) {
        visitFactor(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            visitFactor(ctx.factor(i));
        }
        checkArithmeticOperators(ctx);
        return null;
    }

    @Override
    public Void visitFactor(SPLParser.FactorContext ctx) {
        visitUnary(ctx.unary(0));
        for (int i = 1; i < ctx.unary().size(); i++) {
            visitUnary(ctx.unary(i));
        }
        return null;
    }

    @Override
    public Void visitUnary(SPLParser.UnaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String variableName = ctx.IDENTIFIER().getText();
            if (!variables.containsKey(variableName)) {
                throw new RuntimeException("Variable " + variableName + " not declared.");
            }
        }
        if (ctx.unary().size() > 0) {
            visitUnary(ctx.unary(0));
        }
        return null;
    }

    @Override
    public Void visitPrimary(SPLParser.PrimaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String variableName = ctx.IDENTIFIER().getText();
            if (!variables.containsKey(variableName)) {
                throw new RuntimeException("Variable " + variableName + " not declared.");
            }
        }
        return null;
    }

    private void checkArithmeticOperators(SPLParser.TermContext ctx) {
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            TerminalNode operatorNode = (TerminalNode) ctx.getChild(i);
            String operator = operatorNode.getText();
            if (!isNumericOperator(operator)) {
                throw new RuntimeException("Operator " + operator + " cannot be applied to non-numeric values.");
            }
        }
    }

    private boolean isNumericOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }
}