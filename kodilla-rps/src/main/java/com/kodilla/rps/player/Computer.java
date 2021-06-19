package com.kodilla.rps.player;

import com.kodilla.rps.shapes.Shape;

import java.util.Scanner;

public class Computer implements Player {

    private Scanner scanner = new Scanner(System.in);
    private int score;

    @Override
    public String getName(){
        return "Computer";
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
