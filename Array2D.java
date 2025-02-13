package DSA_java;

import java.util.*;

//(rows * cols) * datatypesize ;
public class Array2D {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		[][](rows and columns) 
		System.out.println("please enter rows and columns");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] numbers = new int[rows][columns];
		System.out.println("please enter i , j ");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		System.out.println("output");
		// output
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

//		q1. take a matrix as input from user. search for a given numbers x and print 
//		the indices at which it occurs. 

//		System.out.println(numbers[2][1]);
		System.out.println("please enter x value:- ");
          int x = sc.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (numbers[i][j] == x) {
					System.out.println("x found at location:- " + i + " " + j);
					
				}
			}
		}

		sc.close();
	}

}
