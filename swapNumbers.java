package DSA_java;

import java.util.Arrays;

public class swapNumbers {
	public static void main(String arg[]) {
		int arr[] = { 0, 30, 50, 70, 30 };
		swap(arr, 1, 0);

		System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		System.out.println(maxRange(arr, 1, 5));
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr, int index1, int index2) {

		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	static int max(int arr[]) {
		int max = arr[0];
//		or
//		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int maxRange(int arr[], int start, int end) {
		int max = arr[0];
//		or
//		int max = Integer.MIN_VALUE;
		for (int i = start; i < end; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		System.out.println(arr);

	}
}
