package java_lab;

class XY {

	public void Z() {

		System.out.println(" Called from XY");
	}
}

class CD extends XY {

	public void T() {

		System.out.println(" Called from T");
	}

}

public class L009_1Inheritence {
	public static void main(String[] args) {

		CD Test = new CD();

		Test.T();
		Test.Z();

	}

}
