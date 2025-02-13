package DSA_java;

import java.util.*;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter Array size:- ");
		int size = sc.nextInt();
		int[] marks = new int[3];
//		marks[0] = 57;
//		marks[1] = 45;
//		marks[2] = 78;
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);

//		for (int i = 0; i < marks.length; i++) {
//			System.out.print(marks[i] + " ");
//		}
		System.out.println();
		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(Arrays.toString(arr));

		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("finding number:- ");
//		linear search
		int x = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (numbers[i] == x) {
				System.out.println("x found at index: " + i);
			}

		}

		sc.close();
	}

}
