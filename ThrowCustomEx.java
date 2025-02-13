package ThrowCustomExceptions;

import java.util.Scanner;

public class ThrowCustomEx {
	public static void main(String[] args) {
		System.out.println("Welcome to Indian Bank");
		Scanner in = new Scanner(System.in);
		System.out.print("PLease Enter The Minimum Deposit Balance:- ");
		try {
			int minBal = in.nextInt();
			if (minBal < 1000) {
//				throw new IllegalArgumentException("Min Bal must be Greater Than 1000");
				throw new MinBalanceExp("Min Bal must be Greater Than 1000");
			}
		} catch (Exception e) {
			System.out.println("Something went Wrong..");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Payment Deposit...");
		}
	}
}
