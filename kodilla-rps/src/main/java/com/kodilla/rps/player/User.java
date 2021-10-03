package com.kodilla.rps.player;

public class User {
    private String name;
    private int score;


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
