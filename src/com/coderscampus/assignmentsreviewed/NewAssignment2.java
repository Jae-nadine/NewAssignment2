package com.coderscampus.assignmentsreviewed;

import java.util.Random;
import java.util.Scanner;

public class NewAssignment2 {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(101);

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int guesses = 5;

		for (int i = 0; i < guesses; i++) {
			System.out.println("Pick a number between 1 and 100:");
			int guess = scanner.nextInt();

			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
			}

			if (guess == randomNumber) {
				System.out.println("You win!");
				return;
			} else if (guess < randomNumber) {
				System.out.println("Please pick a higher number.");
			} else {
				System.out.println("Please pick a lower number.");
			}

		}

		System.out.println("You lose! The number to guess was: " + randomNumber);
		scanner.close();

	}
}
