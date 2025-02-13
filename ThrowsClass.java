package ThrowThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsClass {
	public static void main(String[] args) {
		ThrowsClass td = new ThrowsClass();
		td.chandu();
		td.suresh();
	}

	void chandu() {
		try {

			this.suresh();
		} catch (Exception e) {

		}

	}

	void suresh() {
		this.harish();
	}

	void harish() {
		// file:- file read(FIS) fileInputStream
		
		try {
			FileInputStream fis = new FileInputStream("Hello.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
