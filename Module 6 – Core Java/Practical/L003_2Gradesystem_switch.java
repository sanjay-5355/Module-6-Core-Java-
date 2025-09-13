package java_lab;
import java.util.Scanner;

public class L003_2Gradesystem_switch {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int choice;
        int marks;

        System.out.println("***** Student Grade Menu *****");
        System.out.println("1. Check Pass/Fail");
        System.out.println("2. Check Grade");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        	switch (choice) {
            case 1:
                System.out.print("Enter marks: ");
                marks = sc.nextInt();
                
                if (marks >= 40) {
                    System.out.println("Result: PASS");
                } 
                else {
                    System.out.println("Result: FAIL");
                }
                break;

            case 2:
                System.out.print("Enter marks: ");
                marks = sc.nextInt();
                
                if (marks >= 90) {
                    System.out.println("Grade: A+");
                } 
                else if (marks >= 75) {
                    System.out.println("Grade: A");
                } 
                else if (marks >= 60) {
                    System.out.println("Grade: B");
                } 
                else if (marks >= 40) {
                    System.out.println("Grade: C");
                } 
                else {
                    System.out.println("Grade: F (Fail)");
                }
                break;

            case 3:
                System.out.println("Exiting the system.");
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                
                
        }
}
}


