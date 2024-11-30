package com.aps;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args) {

		// create object of student
		Student student = new Student("Abhay Pratap Singh", 24, "Hell World", "hellworld@gmail.com");

		// write data to file
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("ob.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);

			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// how to searalize

		System.out.println("object state is transferred to file ob !!!");
	}
}
