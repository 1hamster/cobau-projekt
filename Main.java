package org.example;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import grammar.ArithmeticExpressionLexer;

public class Main {
    public static void main(String[] args) {
        String expression = "3 + 5 * (10 - 2)";
        ArithmeticExpressionLexer lexer = new ArithmeticExpressionLexer(CharStreams.fromString(expression));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithmeticExpressionParser parser = new ArithmeticExpressionParser(tokens);
        ParseTree tree = parser.expr();

        System.out.println("Parse tree: " + tree.toStringTree(parser));

        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
    }
}
