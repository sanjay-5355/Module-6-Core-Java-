package java_lab;

import java.util.Scanner;

public class L008_1matrixaddition_and_subtraction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] marks = new int[2][2];
		int[][] marks1 = new int[2][2];
		int[][] add = new int[2][2];
		int[][] sub = new int[2][2];

		System.out.println("Enter the Elements for 1st matrix");
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.println(" Emter the value for " + i + j + ":");
				marks[i][j] = sc.nextInt();

			}
		}

		System.out.println("Enter the Elements for 2nd matrix");
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.println(" Emter the value for " + i + j + ":");
				marks1[i][j] = sc.nextInt();

			}
		}

		System.out.println(" Operations:");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				add[i][j] = marks[i][j] + marks1[i][j];

			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				sub[i][j] = marks[i][j] - marks1[i][j];

			}
		}

		System.out.println(" Here is the matrix  afrer addition :");
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.print(" " + add[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println(" Here is the  marix after sunstraction:");

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.print(" " + sub[i][j] + " ");

			}
			System.out.println();
		}

	}

}
