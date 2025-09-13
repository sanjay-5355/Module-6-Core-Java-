package java_lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L016_2FileInputOutputStream {
	public static void main(String[] args) {
		try {

			//  Open destination file for writing
			FileOutputStream fos = new FileOutputStream("copy.txt");

			//  Open source file for reading
			FileInputStream fis = new FileInputStream("source.txt");

			int i;
			while ((i = fis.read()) != -1) { // read byte by byte
				fos.write(i);
			}

			System.out.println("File copied successfully!");

			// Close both streams
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
