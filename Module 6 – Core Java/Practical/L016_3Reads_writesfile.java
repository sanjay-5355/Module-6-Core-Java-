package java_lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L016_3Reads_writesfile {
	public static void main(String[] args) throws IOException {

		// Source file ( already exist with some data)
		FileInputStream fis = new FileInputStream("t1.txt");

		// Destination file (will be created if not exists)
		FileOutputStream fos = new FileOutputStream("t2.txt");

		int i;
		while ((i = fis.read()) != -1) {
			// Write each byte to destination file
			fos.write(i);

			// Also print on console to verify
			System.out.print((char) i);
		}

		System.out.println(" Content copied from t1.txt to t2.txt successfully!");

		// Close resources
		fis.close();
		fos.close();
	}
}
