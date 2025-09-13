package java_lab;

class BankAccount {
	private int balance = 1000;

	public synchronized void withdraw(String user, int amount) {
		System.out.println(user + " is trying to withdraw: " + amount);

		if (balance >= amount) {
			System.out.println(user + " is proceeding...");
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(user + " completed withdrawal. Remaining balance: " + balance);
		} else {
			System.out.println("Sorry " + user + ", insufficient funds. Balance: " + balance);
		}
	}
}

class UserThread extends Thread {
	private BankAccount account;
	private String user;
	private int amount;

	UserThread(BankAccount account, String user, int amount) {
		this.account = account;
		this.user = user;
		this.amount = amount;
	}

	public void run() {
		account.withdraw(user, amount);
	}
}

public class L013_2synchronized {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		UserThread t1 = new UserThread(account, "Alice", 700);
		UserThread t2 = new UserThread(account, "Bob", 700);

		t1.start();
		t2.start();
	}
}
