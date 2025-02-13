package ExceptionHand;

import java.io.File;
import java.io.FileInputStream;
//checked Exception
import java.io.FileNotFoundException;

public class ExceptionsJava {
	public static void main(String[] args) throws InterruptedException {

		File file = new File("Hello.text");
//		FileInputStream fis = new FileInputStream(file);

		System.out.println("Good Morning...");
		Thread.sleep(1000);
		System.out.println("Good Evening...");

	}

}
