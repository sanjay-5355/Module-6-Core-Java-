package java_lab;

public class L002_3Type_casting {
      public static void main(String[] args) {
        
        
        int intValue = 500;
        long longValue = intValue;         // int to long
        float floatValue = longValue;      // long to float

        System.out.println("**** Implicit Type Casting ****");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to long: " + longValue);
        System.out.println("Converted to float: " + floatValue);

       
        double doubleValue = 100.99;
        int castedInt = (int) doubleValue;  // double to int 
        
        System.out.println();

        System.out.println("**** Explicit Type Casting ****");
        System.out.println("Double value: " + doubleValue);
        System.out.println("Casted to int: " + castedInt);


    }
}