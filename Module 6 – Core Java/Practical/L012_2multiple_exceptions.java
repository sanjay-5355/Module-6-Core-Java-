package java_lab;

public class L012_2multiple_exceptions {

	public static void main(String[] args) {
		try {
			// Case 1: ArithmeticException (divide by zero)
			int a = 10;
			int b = 0;
			int result = a / b;

			// Case 2: ArrayIndexOutOfBoundsException
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]); // invalid index

			// Case 3: NullPointerException
			String str = null;
			System.out.println(str.length());
			
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Invalid array index!");
		} catch (NullPointerException e) {
			System.out.println("Error: Null value encountered!");
		}

	}
}
