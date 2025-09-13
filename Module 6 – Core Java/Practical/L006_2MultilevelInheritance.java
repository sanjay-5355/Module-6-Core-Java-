package java_lab;

class Animal {

	String name;

	public void cat() {

		System.out.println("Cat");
	}

}

class dog extends Animal {

	public void dog() {

		System.out.println("Dog");

	}

}

class cow extends dog {

	public void cow() {

		System.out.println("cow");
	}

}

public class L006_2MultilevelInheritance {

	public static void main(String[] args) {

		cow c = new cow();

		c.name = "Animals";
		c.cat();
		c.dog();
		c.cow();
	}

}
