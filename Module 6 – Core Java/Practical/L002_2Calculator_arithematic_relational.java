package java_lab;

import java.util.Scanner;

public class L002_2Calculator_arithematic_relational {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the first number");
		float num1=sc.nextInt();
		
		System.out.println(" Enter the second number");
		float num2=sc.nextInt();
		
		System.out.println("---------------Arithematic Operations------------------");
		System.out.println(" Addition"+(num1+num2));
		System.out.println(" Substraction"+(num1-num2));
		System.out.println(" Multiplication"+(num1*num2));
     
		if(num2!=0) {
			
			System.out.println(" Division"+(num1/num2));
			System.out.println(" Modulous"+(num1%num2));
		}
		else {
			
			System.out.println(" Divsion and Modulous not allowed with 0");
		}
		
		
		System.out.println("---------------Relational Operations------------------");
		System.out.println(num1+">"+num2+"="+(num1>num2));
		System.out.println(num1+"<"+num2+"="+(num1<num2));
		System.out.println(num1+"=="+num2+"="+(num1==num2));
		System.out.println(num1+"!="+num2+"="+(num1!=num2));
		System.out.println(num1+">="+num2+"="+(num1>=num2));
		System.out.println(num1+"<="+num2+"="+(num1<=num2));
		
		
		
	}

}
