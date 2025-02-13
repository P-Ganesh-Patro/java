package DSA_java;

import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String name = "charan";
//		String fullName = "jugolo charan";
//		String sentence = "my name is jugolo charan";
//		name.concat(sentence);
//		System.out.println(name);
//		concatenation
		/*
		 * String firstName = "kiems "; String lastName = "thomson"; String fullName =
		 * firstName.concat(lastName); String fullName1 = firstName + "@" + lastName;
		 * System.out.println(fullName1.length()); System.out.println(fullName1);
		 */
//		charAt 
//		System.out.println(fullName1.charAt(1));

//		String name1 = sc.next();
//		String name1 = sc.nextLine();
//		System.out.println("your name is :- " + name1);
		/*
		 * for (int i = 0; i < fullName1.length(); i++) {
		 * System.out.print(fullName1.charAt(i) + " ");
		 * 
		 * }
		 */
		/*
		 * String name1 = "p eswar"; String name2 = "eswarrao";
		 * System.out.println(name1.equals(name2));
		 * System.out.println(name1.compareTo(name2)); // 0(==)
		 * System.out.println(name1.compareTo(name2)); // -ve(<)
		 * System.out.println(name1.compareTo(name2)); // +ve(>)
		 */

//		String name1 = "eswar Rao";
//		String name2 = "eswar";
//		System.out.println(name1.compareToIgnoreCase(name2));

		/*
		 * String name = new String("Ganesh"); String name1 = new String("Ganesh"); if
		 * (name == (name1)) { System.out.println("strings are equal"); } else {
		 * System.out.println("strings are not equal"); }
		 */
//		SUB-STRING

		/*
		 * String sentance = "my name is eswar"; // subString(beginning index, end
		 * index) String name = sentance.substring(3, sentance.length());
		 * System.out.println(name);
		 */

//		Strings are immutable

//		parsing 
		/*
		 * int number = 123; String num = Integer.toString(number);
		 * System.out.println(num);
		 * 
		 * String number1 = "12345"; int num1 = Integer.parseInt(number1);
		 * System.out.println(num1);
		 */

		String sentance = "ebcdef";
		String result = "";

		for (int i = 0; i < sentance.length(); i++) {
//			System.out.println(sentance.charAt(i));
			if (sentance.charAt(i) == 'e') {
				result = result + 'i';

			} else {
				result = result + sentance.charAt(i);
			}
		}
		System.out.println(result);
	}

}
