package DSA_java;

import java.util.Arrays;
//reverse an array

//given number is palindrome or not 

public class functionalRecursion {
	public static void main(String[] arg) {
		int array[] = { 10, 20, 30, 40, 90 };

//		System.out.println(start);
//		System.out.println(end);
		System.out.println(Arrays.toString(array));
//		swap(array); 
		int start = 0;
		int end = array.length - 1;
		String palindrome = "LeveL";
//		palindrome(palindrome);

	}

//reverse number
	public static void swap(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			start++;
			end--;
		}
		System.out.println(Arrays.toString(array));

	}

	public static void reverseArrayRec(int start, int end) {

	}

//palindrome 

	public static void palindrome(String palindrome, int i ) {
//		if(palindrome[i] != palindrome[n-i-1]) {
//			return false; 
//		}

	}
}
