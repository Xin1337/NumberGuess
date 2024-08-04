package org.example;
import java.util.Scanner;
import java.util.Random;

public class askNumber {
    public void guessGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
        System.out.println("Guess the number! It's between 1 and 10");

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            if (number == targetNumber) {
                System.out.println("You guessed the correct number!");
                break;
            } else {
                System.out.println("Try again!");
                System.out.println("The expected number is " + (number > targetNumber ? "smaller" : "greater") + " than " + number);
            }
        }
    }
}