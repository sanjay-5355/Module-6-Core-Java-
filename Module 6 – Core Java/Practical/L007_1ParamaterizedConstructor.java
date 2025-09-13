package java_lab;


class School {
    String name;
    int age;
    double percentage;

    
    School(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class L007_1ParamaterizedConstructor {

    public static void main(String[] args) {

        
    	School s1 = new School("Rahul", 20, 85.5);

        
        s1.displayDetails();
    }
}
