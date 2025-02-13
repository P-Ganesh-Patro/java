package DSA_java;

import java.util.Scanner;

public class parameterisedRecursion {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The n Value: ");
		int n = scanner.nextInt();

		int sum = 0;
		System.out.println("Function para");
		recPara(n, sum);
		System.out.println("Function rec");
		int recFunc = recFunc(n);
		System.out.println(recFunc);

		System.out.println("FactorialOfN is: " + factOfN(n, 1));

	}

//parameterized...
	public static void recPara(int n, int sum) {
		if (n < 1) {
			System.out.println("sum: " + sum);
			return;
		}

		recPara(n - 1, sum + n);

	}

// function
	public static int recFunc(int n) {
		if (n == 0)
			return 0;
		return n + recFunc(n - 1);

	}
//factorial
	public static int factOfN(int n, int fact) {
		if (n == 0) {
			return fact;
		}

		return factOfN(n - 1, fact * n);

	}

}
