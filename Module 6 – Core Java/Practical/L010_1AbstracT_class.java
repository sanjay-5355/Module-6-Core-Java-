package java_lab;

abstract class game {

	String name;

	game(String name) {

		this.name = name;
	}

	abstract void play();

	public void start() {

		System.out.println(" Starting the game :" +name );
	}
}

class Cricket extends game {

	public Cricket() {

		super("cricket");
	}

	public void play() {

		System.out.println(" Playing cricket");
	}

}

class football extends game {

	public football() {

		super("football");
	}

	public void play() {

		System.out.println(" Playing football");
	}

}

public class L010_1AbstracT_class {
	
	public static void main(String[] args) {
		
		
		Cricket cric=new Cricket();
		
		cric.start();
        cric.play();
		
		football foot = new football();
		
		foot.start();
		foot.play();
	}

}
