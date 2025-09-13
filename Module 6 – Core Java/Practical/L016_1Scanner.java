package java_lab;

import java.util.Scanner;

public class L016_1Scanner {
	public static void main(String[] args) {
		// ✅ Create Scanner object to read from console
		Scanner sc = new Scanner(System.in);

		// ✅ Read different types of inputs
		System.out.print("Enter your name: ");
		String name = sc.nextLine(); // read full line (including spaces)

		System.out.print("Enter your age: ");
		int age = sc.nextInt(); // read integer

		System.out.print("Enter your salary: ");
		double salary = sc.nextDouble(); // read double value

		
		System.out.println("\n--- User Details ---");
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Salary : " + salary);

		
	}
}
