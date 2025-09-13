package java_lab;

import java.util.Scanner;

public class L008_3String_Comparison {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the first String :");
		String str1 = sc.nextLine();
		
		System.out.println(" Enter the first String :");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			
			System.out.println(" using equal : Both the string are equal");
		}
		else {
			
			System.out.println(" using equal : Both the string are not equal");
		}
		
		
		int result=str1.compareTo(str2);
		
		if (result==0) {
			
			System.out.println(" using compare : Both the string are equal");
		}
		else {
			
			System.out.println(" using compare : Both the string are not equal");
		}
		
	}

}
