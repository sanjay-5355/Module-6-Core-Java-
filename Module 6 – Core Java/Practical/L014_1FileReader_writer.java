package java_lab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L014_1FileReader_writer {

	public static void main(String[] args) throws IOException {

		String msg = "this msg will stored into file";

//			FileWriter fr= new FileWriter("t2.txt");
//			fr.write(msg);
//			fr.flush();
//			fr.close();
//			System.out.println("done");

		FileReader fr = new FileReader("t2.txt");
		int i;

		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
