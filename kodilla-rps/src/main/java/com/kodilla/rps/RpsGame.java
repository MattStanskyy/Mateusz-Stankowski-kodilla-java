package com.kodilla.rps;

import com.kodilla.rps.player.User;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class RpsGame {
    private Scanner scanner = new Scanner(System.in);
    private User user = new User();

    public String userSetter() {
        System.out.println("Welcome in Rock, Paper, Scissors game!");
        return user.getName();
    }

    public int roundSetter() {
        System.out.println("Please enter amount of rounds (min 1, max 10): ");
        int gameRounds = scanner.nextInt();
        while (gameRounds < 1 || gameRounds > 10) {
            System.out.println("You can't choice " + gameRounds + " rounds!\n" + "Please enter number of rounds again: ");
            gameRounds = scanner.nextInt();
        }
        try {
            return gameRounds;
        } catch (InputMismatchException e) {
            System.out.println("Enter a number!");
            return new Scanner(System.in).nextInt();
        }
    }

    public String choicesMenu() {
        while (true) {
            System.out.println("To start, choose yours weapon, [1] Rock, [2] Paper, [3] Scissors\n" + "To exit game enter [X]\n" + "To back to the beginning again, enter [N]");
            String choices = scanner.nextLine().toUpperCase();
            while (choices != "1" || choices != "2" || choices != "3" || choices != "X" || choices != "N" ) {
                System.out.println("You have to choice one of the possible actions!\n" + "Please enter action again: ");
                return new Scanner(System.in).nextLine();
            }
            if (choices == "X") {
                break;
            }
            if (choices == "N") {
                System.out.println("Are you sure, you want start from beginning? Enter Y/N: ");
                String beginningChoice = scanner.next();
                if (beginningChoice.equals("Y")) {
                    return userSetter();
                }
                if (beginningChoice.equals("N")) {
                    return new Scanner(System.in).nextLine();
                }
            }
        }
        return choicesMenu();
    }

}
