package java_lab;

class MyThread extends Thread {
	 private String threadName;

	 
	 MyThread(String name) {
	     threadName = name;
	 }

	 
	 public void run() {
	     for (int i = 1; i <= 5; i++) {
	         System.out.println(threadName + " - Count: " + i);
	         try {
	             Thread.sleep(500); 
	         } catch (InterruptedException e) {
	             System.out.println(threadName + " interrupted.");
	         }
	     }
	     System.out.println(threadName + " finished.");
	 }
	}

public class L013_1multiple_thread {

 public static void main(String[] args) {
     // Create multiple threads
     MyThread t1 = new MyThread("Thread-1");
     MyThread t2 = new MyThread("Thread-2");
     MyThread t3 = new MyThread("Thread-3");

     // Start threads
     t1.start();
     t2.start();
     t3.start();

     System.out.println("Main thread finished.");
 }
}
