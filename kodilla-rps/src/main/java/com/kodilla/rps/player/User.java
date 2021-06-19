package com.kodilla.rps.player;

import com.kodilla.rps.shapes.Shape;

import java.util.Scanner;

public class User implements Player {
    private Scanner scanner = new Scanner(System.in);
    private int score;

    @Override
    public String getName(){
        System.out.println("Please enter your name: ");
        String userName = scanner.next();

        if (userName.length() < 3) {
            while (userName.length() < 3) {
                System.out.println("Your name has to has at least 3 chars!\n" + "Please enter your name again: ");
                userName = scanner.nextLine();
            }
        }
        return "Hello " + userName + "!";
    }

    @Override
    public int getHand() {
        int hand = scanner.nextInt();

        if (hand == 1) {
            System.out.println(Shape.ROCK);
        } else if (hand == 2) {
            System.out.println(Shape.PAPER);
        } else if (hand == 3) {
            System.out.println(Shape.SCISSORS);
        }
        return hand;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int addScore() {
        return this.score++;
    }

}
