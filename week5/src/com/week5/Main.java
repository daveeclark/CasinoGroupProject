package com.week5;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int guesses = 0;
        int correctGuess = (int) (Math.random() * 10);

        System.out.println("Welcome to the guessing game! " +
                "\n" + "Guess a number between 0-10!");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> guessHoe = new ArrayList<Integer>();

        while (true) {
            int enterGuess = scanner.nextInt();
            if (guessHoe.contains(enterGuess)){

            } else {
                guessHoe.add(enterGuess);
            }
                if (enterGuess > correctGuess) {
                System.out.println("Too Large");
                //guessHoe.add(enterGuess);
            } else if (enterGuess < correctGuess) {
                    System.out.println("Too Small");
                    //guessHoe.add(enterGuess);
                }
                if (enterGuess == correctGuess) {
                    System.out.println("Correct Guess");
                break;
            }

        }
            System.out.println("It took you " + guessHoe.size() +
                    " guesses for the correct number");
        }

    }
