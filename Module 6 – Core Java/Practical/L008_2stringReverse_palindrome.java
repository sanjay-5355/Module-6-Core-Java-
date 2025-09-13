package java_lab;

import java.util.Scanner;

public class L008_2stringReverse_palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter a String: ");
		String test = sc.nextLine();

		String out = reverseString(test);

		System.out.println(" The reversed string is :" + out);
		
		if(test.equals(out)) {
			
			System.out.println(" String is a palindrome");
		}
		else {
			
			System.out.println(" String is not a palindrome");
		}
		
	}

public static String reverseString(String test) {
	String reversed="";
	for (int i = test.length()-1;i>=0;i--) {
		
		reversed+=test.charAt(i);
		
	}
	return reversed;
}
}