package com.kodilla.rps;

import com.kodilla.rps.player.Computer;
import com.kodilla.rps.player.User;

import java.util.Scanner;

public class RpsGame {
    private Scanner scanner = new Scanner(System.in);
    private User user = new User();
    private Computer computer =new Computer();
    private int games = 0;
    private int rounds;
    private int firstChoice = 0;


    public String userSetter() {
        System.out.println("Welcome in Rock, Paper, Scissors game!\n" + "Enter your name:");
        user.setName(scanner.nextLine());
        if (user.getName().length() < 3) {
            while (user.getName().length() < 3) {
                System.out.println("Your name has to have at least 3 chars!");
                user.setName(scanner.nextLine());
            }
        }
        System.out.println("Hello " + user.getName() + "!");
        roundSetter();
        return user.getName();
    }

    public void roundSetter() {
        System.out.println("Please insert number of rounds (min 1, max 5): ");
        rounds = scanner.nextInt();

        if (rounds < 1 || rounds > 5) {
            while (rounds < 1 || rounds > 5) {
                System.out.println("You can't choice " + rounds + " rounds!\n" + "Please enter number of rounds again: ");
                rounds = scanner.nextInt();
            }
        } else {
            System.out.println("You chosen " + rounds + " rounds.");
        }
    }

    public void choicesMenu() {
        while (true) {
            System.out.println("To start, choose yours weapon, 1 - Rock, 2 - Paper, 3 - Scissors\n" + "To exit game enter 4\n" + "To back to beginning, enter 5");
            firstChoice = scanner.nextInt();
            if(firstChoice < 1 || firstChoice > 5) {
                while (firstChoice < 1 || firstChoice > 5) {
                    System.out.println("You have to choice one of the possible actions!\n" + "Please enter number again: ");
                    firstChoice = scanner.nextInt();
                }
            }
            if (firstChoice == 4) {
                break;
            }
            if (firstChoice == 5) {
                System.out.println("Are you sure, you want start from the beginning? Enter Y/N: ");
                String beginningChoice = scanner.next();
                if (beginningChoice.equals("Y")) {
                    userSetter();
                }
                if (beginningChoice.equals("N")) {
                    choicesMenu();
                }
            }
            if (games < rounds) {
                if (firstChoice == 1 || firstChoice == 2 || firstChoice == 3) {
                    game(firstChoice, user, computer);
                }
                games++;
            }
            if (games == rounds) {
                if (user.getScore() > computer.getScore()) {
                    System.out.println("Game end, " + user.getName() + " win!\n");
                } else if (computer.getScore() > user.getScore()) {
                    System.out.println("Game end, " + computer.getName() + " win!\n");
                } else if (user.getScore() == computer.getScore()) {
                    System.out.println("Game end with a draw!\n");
                }
                user.setScore(0);
                computer.setScore(0);
                rounds = 0;
                games = 0;
                roundSetter();
            }
        }
    }

    public void game(int choice, User user, Computer computer) {

        System.out.println(user.getName() + " :");
        if (choice == 1) {
            System.out.println("ROCK");
        } else if (choice == 2) {
            System.out.println("PAPER");
        } else if (choice == 3) {
            System.out.println("SCISSORS");
        }

        System.out.println(computer.getName() + " :");
        int computerChoice = computer.computerChoiceGenerator();

        if (computerChoice == 0 || computerChoice == 1 || computerChoice == 2) {
            if (choice == 1 & computerChoice == 2) {
                user.addScore();
                System.out.println("Player win!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            } else if (choice == 1 & computerChoice == 1) {
                computer.addScore();
                System.out.println("Computer win!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            } else if (choice == 1 & computerChoice == 0) {
                System.out.println("It's a draw!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");

            }

            if (choice == 2 & computerChoice == 0) {
                user.addScore();
                System.out.println("Player win!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            } else if (choice == 2 & computerChoice == 2) {
                computer.addScore();
                System.out.println("Computer win!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            } else if (choice == 2 & computerChoice == 1) {
                System.out.println("It's a draw!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            }

            if (choice == 3 & computerChoice == 1) {
                user.addScore();
                System.out.println("Player win!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            } else if (choice == 3 & computerChoice == 0) {
                computer.addScore();
                System.out.println("Computer win!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            } else if (choice == 3 & computerChoice == 2) {
                System.out.println("It's a draw!");
                System.out.println("Player's score: " + user.getScore());
                System.out.println("Computer's score: " + computer.getScore() + "\n");
            }
        }
    }
}
