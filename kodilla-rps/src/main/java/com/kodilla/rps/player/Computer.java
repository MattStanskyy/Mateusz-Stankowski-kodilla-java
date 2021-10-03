package com.kodilla.rps.player;

import java.util.Random;

public class Computer {

    private int score;


    public String getName() {
        return "Computer";
    }

    public int computerChoiceGenerator() {
        Random generator = new Random();
        int result = generator.nextInt(3);
        if(result == 0){
            System.out.println("ROCK");
        }else if(result == 1){
            System.out.println("PAPER");
        } else if(result == 2) {
            System.out.println("SCISSORS");
        }
        return result;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int addScore() {
        return this.score++;
    }

}
