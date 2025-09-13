package java_lab;

class loading{
	
	public int add(int x, int y) {
		
		return x + y;
	}
	
	public double add(double x , double y) {
		
		return x+y;
	}
	
    public String add(String x , String y) {
		
		return x+y;
	}
	
}

public class L005_2method_overloading_datatypes {
	public static void main(String[] args) {
		
		loading t1=new loading();
		
		System.out.println("Sum of two integer: " + t1.add(5, 10));
		System.out.println("Sum of two double: "+t1.add(51.5,5.5));
		System.out.println("Concatination of two string : " +t1.add("java","course"));
	}

}
