package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text 1, test 1", (text -> "ABC"));
        poemBeautifier.beautify("Text 2, test 2", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Text 3, test 3", (text -> text.toLowerCase()));
        poemBeautifier.beautify("Text 4, Test 4", (text -> text.replace("T", " ")));
        poemBeautifier.beautify("Text 5, test 5 ", (text -> text.replaceAll("Text 5, test 5 ", "Miszcz ") + text.repeat(2)));
    }
}
