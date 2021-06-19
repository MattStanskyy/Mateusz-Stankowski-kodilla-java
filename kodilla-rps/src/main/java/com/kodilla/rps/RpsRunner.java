package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String beginningChoice = "";



        while (true) {
            System.out.println("Welcome in Rock, Paper, Scissors game!");

            System.out.println("Please enter your name: ");
            String userName = scanner.next();

            if (userName.length() < 3) {
                while (userName.length() < 3) {
                    System.out.println("Your name has to has at least 3 chars!\n" + "Please enter your name again: ");
                    userName = scanner.nextLine();
                }
            }
            System.out.println("Hello " + userName + "!");

            System.out.println("Please insert number of rounds (min 1, max 5): ");
            int gameRounds = scanner.nextInt();
            while (gameRounds < 1 || gameRounds > 5) {
                System.out.println("You can't choice " + gameRounds + " rounds!\n" + "Please enter number of rounds again: ");
                gameRounds = scanner.nextInt();
            }
            System.out.println("You chosen " + gameRounds + " rounds.");
            scanner.nextLine();

            System.out.println("To start, choose yours weapon, 1 - Rock, 2 - Paper, 3 - Scissors\n" + "To exit game enter 4\n" + "To back to beginning again, enter 5");
            int firstChoice = scanner.nextInt();
            while (firstChoice < 1 || firstChoice > 5) {
                 System.out.println("You have to choice one of the possible actions!\n" + "Please enter action again: ");
                 firstChoice = scanner.nextInt();
            }
            if (firstChoice == 4) {
                break;
            }
            if (firstChoice == 5) {
                System.out.println("Are you sure, you want star from beginning? Enter Y/N: ");
                beginningChoice = scanner.next();
                if (beginningChoice.equals("Y")) {

                }
                if (beginningChoice.equals("N")) {
                    System.out.println("To start, choose yours weapon, 1 - Rock, 2 - Paper, 3 - Scissors\n" + "To exit game enter 4\n" + "To back to beginning again, enter 5");
                    scanner.match();
                }
            }
        }
    }
}
