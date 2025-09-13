package java_lab;

public class L012_1try_catch_finally {
    public static void main(String[] args) {
        try {
           
            int a = 10;
            int b = 0;   
            int result = a / b;
            System.out.println("Result: " + result); 
        } 
        catch (ArithmeticException e) {
            
            e.printStackTrace();
        } 
        finally {
            
            System.out.println("Execution finished. Cleaning up resources...");
        }

        System.out.println("Program continues normally...");
    }
}
