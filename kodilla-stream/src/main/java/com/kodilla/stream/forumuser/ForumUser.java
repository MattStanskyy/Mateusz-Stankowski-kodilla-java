package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueUserId;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int amountOfPosts;

    public ForumUser(final int uniqueUserId, final String userName, final char gender, final int birthYear, final int birthMonth, final int birthDay, final int amountOfPosts) {
        this.uniqueUserId = uniqueUserId;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        this.amountOfPosts = amountOfPosts;
    }

    public int getUniqueUserId() {
        return uniqueUserId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserId=" + uniqueUserId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", amountOfPosts=" + amountOfPosts +
                '}';
    }
}
