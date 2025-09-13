package java_lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L014_2BufferedReader {

    public static void main(String[] args) throws IOException {

        String msg = "This message will be stored into file\nAnd read line by line using BufferedReader.";

        
        FileWriter fw = new FileWriter("t2.txt");
        fw.write(msg);
        fw.flush();
        fw.close();
        System.out.println("File written successfully.");

        
        BufferedReader br = new BufferedReader(new FileReader("t2.txt"));
        String line;
        System.out.println("\nReading file line by line:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
