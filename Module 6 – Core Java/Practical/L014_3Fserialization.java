package java_lab;

import java.io.*;

class Students implements Serializable {
	

	int id;
	String name;

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("ID: " + id + ", Name: " + name);
	}
}

public class L014_3Fserialization {

	public static void main(String[] args) {
		String filename = "student.ser";

		
		try {
			Students s1 = new Students(101, "Rahul");
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s1); // writing object
			oos.close();
			fos.close();

			System.out.println("✅ Object has been serialized and saved in " + filename);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//  Deserialization (reading object from file)
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Students s2 = (Students) ois.readObject(); // reading object
			ois.close();
			fis.close();

			System.out.println("✅ Object has been deserialized:");
			s2.display();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
