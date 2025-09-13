package java_lab;

import java.util.Scanner;

class test{
	
	public int maximum(int x, int y, int z){
		int max=x;
		
		if(y>max) {
			max=y;
		}
		if(z>max) {
			max=z;
		}
		return max;
	}
	
}

public class L005_1maximum_three_number {

	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num3=sc.nextInt();
		
		test t1=new test();
		
		int res=t1.maximum(  num1, num2,num3);
		System.out.println(" Here is the maximum number: " + res);
		
		
	}
}
