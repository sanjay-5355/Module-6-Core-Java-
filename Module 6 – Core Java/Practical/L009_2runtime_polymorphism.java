package java_lab;

class Human {
	public void work() {
		System.out.println("A human works in general.");
	}
}

class college extends Human {

	public void work() {
		System.out.println("A student studies and does homework.");
	}
}

class Employee extends Human {

	public void work() {
		System.out.println("An employee works in a company.");
	}
}

class Doctor extends Human {

	public void work() {
		System.out.println("A doctor treats patients.");
	}
}

public class L009_2runtime_polymorphism {
	public static void main(String[] args) {

		Human Hum = new Human();
		Hum.work(); // Calls Human's work()

		Employee Hum1 = new Employee();
		Hum1.work(); // Calls Employee's work()

		Doctor Hum2 = new Doctor();
		Hum2.work(); // Calls Doctor's work()
	}
}
