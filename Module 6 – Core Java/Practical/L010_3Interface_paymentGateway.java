package java_lab;

import java.util.Scanner;

interface gateway{
	
	public void pay(double amount);
}



class creditcard implements gateway{
	
	public void pay(double amount) {
		
		System.out.println("Paid "+amount + " through credit card");
	}
}

class paypal implements gateway{
	
	public void pay(double amount) {
		
		System.out.println("Paid "+amount + "through paypal");
	}
}
class UPI implements gateway{
	
	public void pay(double amount) {
		
		System.out.println("Paid "+amount + "through UPI");
	}
}




public class L010_3Interface_paymentGateway {
    public static void main(String[] args) {
		
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println(" ----------------- Select Payment Method --------------------");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. UPI");
        
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();
        
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        
        
        
        switch(choice){
        	
        case 1:
        	creditcard payment=new creditcard();
        	payment.pay(amount);
        	break;
        case 2:
        	paypal payment1 = new paypal();
        	payment1.pay(amount);
        	break;
        case 3:
        	UPI payment2 = new UPI();
        	payment2.pay(amount);
        	break;
        	default:
        		System.out.println(" Invalid choice");
        	
        }
        
	}
}
