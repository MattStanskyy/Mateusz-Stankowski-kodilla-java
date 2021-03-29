package com.kodilla.stream;

//import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.lambda.Executor;
//import com.kodilla.stream.lambda.ExpressionExecutor;
//import com.kodilla.stream.lambda.Processor;
//import com.kodilla.stream.reference.FunctionalCalculator;
//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
//import  com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //System.out.println("Welcome to module 7 - Stream" + "\n");

        //System.out.println("Module 7.1 - examples");
        //Processor processor = new Processor();
        //processor.execute(() -> System.out.println("This is an example text." + "\n"));


        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //System.out.println("Calculating expressions with lambdas");
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        //System.out.println("");
        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        //System.out.println("\n" + "Assignment 7.1");
        //PoemBeautifier poemBeautifier = new PoemBeautifier();
        //poemBeautifier.beautify("Text 1, test 1", (text -> "ABC"));
        //poemBeautifier.beautify("Text 2, test 2", (text -> text.toUpperCase()));
        //poemBeautifier.beautify("Text 3, test 3", (text -> text.toLowerCase()));
        //poemBeautifier.beautify("Text 4, Test 4", (text -> text.replace("T", " ")));
        //poemBeautifier.beautify("Text 5, test 5 ", (text -> text.replaceAll("Text 5, test 5 ", "Miszcz ") + text.repeat(2)));


        //System.out.println("\n" + "Module 7.2 - examples");
        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);


        //System.out.println("\n" + "Module 7.3 - examples");
        //People.getList().stream().map(String::toUpperCase).filter(s -> s.length() > 11).map(s -> s.substring(0, s.indexOf(' ') + 2) + ".").filter(s -> s.substring(0,1).equals("M")).forEach(System.out::println);

        //BookDirectory theBookDirectory = new BookDirectory();
        //Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                //.filter(book -> book.getYearOfPublication() > 2005)
                //.collect(Collectors.toMap(Book::getSignature, book -> book));

        //System.out.println("# elements: " + theResultMapOfBooks.size());
        //theResultMapOfBooks.entrySet().stream()
                //.map(entry -> entry.getKey() + ": " + entry.getValue())
                //.forEach(System.out::println);

        //String theResultStringOfBooks = theBookDirectory.getList().stream()
                //.filter(book -> book.getYearOfPublication() > 2005)
                //.map(Book::toString)
                //.collect(Collectors.joining(",\n","<<",">>"));

        //ystem.out.println(theResultStringOfBooks);


        System.out.println("\n" + "Assignment 7.3");
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBirthDate().getYear() >= 20)
                .filter(forumUser -> forumUser.getAmountOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserId, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
