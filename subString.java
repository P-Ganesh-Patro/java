package DSA_FGF;

import java.io.*;
import java.lang.*;

public class subString {
	public static void main(String[] args) {
		String str = new String("welcome to tinydata technologies");
		System.out.println("original string:- " + str);

		System.out.println("substring with start index: " + str.substring(5));

		System.out.println("substring with start index and end index: " + str.substring(5, 18));
	}

}
