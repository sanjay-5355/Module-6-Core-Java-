package java_lab;

class Phones {
	
	public void sound() {
		
		System.out.println(" Phones sound");
	}
	
}

class Nokia extends Phones{
	
	public void sound() {
		
		System.out.println(" Nokia sound");
	}
	
}

class samsung extends Phones {
	
	public void sound() {
		
		System.out.println(" samsung sound");
	}
	
}


public class L006_3MethodOverriding_poly {
	public static void main(String[] args) {
		
		samsung c= new samsung();
		
		c.sound();
		
		Nokia n =new Nokia();
		n.sound();
		
		
	}

}
