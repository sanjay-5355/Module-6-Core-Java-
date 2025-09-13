package java_lab;

import java.util.Scanner;

   class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
   }

	class voting {

		public static void checkAge(int age) throws InvalidAgeException {
			if (age < 18) {
				throw new InvalidAgeException("Age must be 18 or above to vote.");
			} else {
				System.out.println("Welcome! You are eligible to vote.");
			}
		}
	}

	public class L012_3custom_exception {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your age: ");
			int age = sc.nextInt();

			try {
				voting.checkAge(age);
			} catch (InvalidAgeException e) {
				System.out.println("Custom Exception Caught: " + e.getMessage());
			} 
		}
	}
