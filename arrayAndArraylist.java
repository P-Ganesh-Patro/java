package DSA_java;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayAndArraylist {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);

		String[] rollNumber = new String[5];

//		or directly 
//		int[] rollNumber1 = { 10, 20, 30, 40, 50 };
//		System.out.println(rollNumber1);
//		for (int i = 0; i < rollNumber1.length; i++) {
//			System.out.print(rollNumber1[i] + " ");
//		}
//		System.out.println(rollNumber[0]);

//		int[] arrNum = new int[5];
//		arrNum[0] = 40;
//		arrNum[1] = 41;
//		arrNum[2] = 14;
//		arrNum[3] = 32;
//		arrNum[4] = 69;
//		System.out.println(Arrays.toString(arrNum));
//		for (int i = 0; i < arrNum.length; i++) {
//			arrNum[i] = in.nextInt();
//		}
//
//		for (int i = 0; i < arrNum.length; i++) {
//			System.out.print(arrNum[i] + " ");
//		}
////
//		for (int num : arrNum) {
//			System.out.print(num + " ");
//		}

//		String[] str = new String[4];
//		for (int i = 0; i < str.length; i++) {
//			str[i] = in.nextLine();
//		}
//		System.out.println(Arrays.toString(str));

//		2d arrays (multidimension)

		/*
		 * 1 2 3 4 5 6 7 8 9
		 */

//		int[][] arr = new int[3][];

		int[][] arr = { { 1, 2, 3 }, // 0th index
				{ 4, 5, 6 }, // 1st index
				{ 7, 8, 9, 20 } // 2nd index
		};

//		input 
//		System.out.println("multiDimensinal array");
//		int[][] arrMul = new int[3][]; 
//		for(int i =0; i < arr.length; i++) {
////			arr[i] = in.nextInt();
//			for(int j =0; j < arr[i].length; j++) {
//				arr[i][j] =in.nextInt();
//			}
//		}
////		string or int
//		for(int ele[]: arr) {
//			System.out.println(Arrays.toString(ele));
//		}
//		
//		ArrayList
		System.out.println("Array List");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(52);
		list.add(10);
		list.add(32);
//		...
//		System.out.println(list);
//		list.set(2, 36);
//		System.out.println(list);
//		list.remove(0);
//		System.out.println(list);
//		System.out.println(list.contains(33));
//
//		for (int i = 0; i < 6; i++) {
//			list.add(in.nextInt());
//		}
//		System.out.println(list);
//		for (int i = 0; i < 6; i++) {
//			System.out.println(list.get(i));
//		}
//		

//		multidimensional ArrayList
		ArrayList<ArrayList<Integer>> mulList = new ArrayList<>();
		
//		initialization
		for(int i =0; i < 3; i++) {
			mulList.add(new ArrayList<>());
		}
		
//		add elements
		for(int i=0; i < 3; i++) {
			for(int j  =0; j < 3; j++) {
				mulList.get(i).add(in.nextInt());
			}
		}
		
		System.out.println(mulList);
		
	}
}
