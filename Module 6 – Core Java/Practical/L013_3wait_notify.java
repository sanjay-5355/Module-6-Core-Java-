package java_lab;

class Shared {
	synchronized void produce() {
		System.out.println("Producer started...");
		try {
			wait(); // wait until someone notifies
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Producer resumed after notify!");
	}

	synchronized void consume() {
		System.out.println("Consumer working...");
		notify(); // notify the producer
		System.out.println("Consumer sent notify!");
	}
}

public class L013_3wait_notify {
	public static void main(String[] args) {
		Shared s = new Shared();

		Thread producer = new Thread(() -> s.produce());
		Thread consumer = new Thread(() -> {
			try {
				Thread.sleep(1000); //  producer start first
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			s.consume();
		});

		producer.start();
		consumer.start();
	}
}
