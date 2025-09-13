package java_lab;

class Counter {
    
    static int count = 0;

    
    Counter() {
        count++;
    }

    
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class L005_3static_variable {

    public static void main(String[] args) {
        
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        
        Counter.displayCount();
    }
}
