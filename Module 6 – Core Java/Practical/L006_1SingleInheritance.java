package java_lab;

class Test5 {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}


class Dog extends Test5 {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class L006_1SingleInheritance {
    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        
        myDog.name = "Buddy"; 
        myDog.eat();          
        myDog.bark();         
    }
}