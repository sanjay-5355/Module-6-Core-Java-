package java_lab;


import java.util.Scanner;

 class Student {
	 
    
    String name;
    int age;

    
    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter student age: ");
        age = sc.nextInt();
    }

    
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public class Students_details_class {
    	
        public static void main(String[] args) {
        Student s = new Student();

        s.getDetails();        
        s.displayDetails();   
    }
}
 }
    


  
