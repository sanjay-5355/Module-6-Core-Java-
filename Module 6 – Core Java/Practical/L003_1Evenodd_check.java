package java_lab;

import java.util.Scanner;

public class L003_1Evenodd_check {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } 
        else {
            System.out.println(number + " is Odd.");
        }

        
    }
}
