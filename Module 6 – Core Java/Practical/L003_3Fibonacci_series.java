package java_lab;

import java.util.Scanner;

public class L003_3Fibonacci_series {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter the number of terms");
		 int num = sc.nextInt();
		 
		 System.out.println(" Here is the series");
		 int first=0,second=1;

        for(int i=0;i<=num;i++) {
        	
        	System.out.print(first+" ");
        	
        	int res=first+second;
        	first=second;
        	second=res;
        	
        }
		
	}
}
