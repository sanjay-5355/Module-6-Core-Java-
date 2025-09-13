package java_lab;

interface Playable {
	void play();
}

interface Storable {
	void save();
}

class Game implements Playable, Storable {

	public void play() {
		System.out.println("The game is now being played!");
	}

	public void save() {
		System.out.println("The game progress has been saved.");
	}
}

public class L010_2multiple_interfacesss {

	public static void main(String[] args) {
		Game g = new Game();

		
		g.play();
		g.save();
	}
}
