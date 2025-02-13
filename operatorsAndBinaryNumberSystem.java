package DSA_java;

public class operatorsAndBinaryNumberSystem {

	public static void main(String args[]) {
//		System.out.println("operatorsAndBinaryNumberSystem");
//		int a = 10;
//		int b = 20;
//		int c = ++a;
//		System.out.println(c);
//		System.out.println(c);
//		int d = b++;
//		System.out.println(b);
//		System.out.println(d);
//		bit manipulation

//		get bit
//		int n = 5;
//		int pos = 1;
//		int bitMask = 1 << pos;
//
//		if ((bitMask & n) == 0) {
//			System.out.println("bit was 0");
//		} else {
//			System.out.println("bit was 1");
//		}

//		set bit
//		int n = 5;
//		int pos = 1;
//		int bitMask = 1 << pos;
//		int newNumber = bitMask | n;
//		System.out.println(newNumber);

//		clear bit
//		int n = 5;
//		int pos = 2;
//		int bitMask = 1 << pos;
//		int notBitMask = ~(bitMask);
//
//		int newNumber = notBitMask & n;
//		System.out.println(newNumber);

//		update bit

		int n = 5;
		int pos = 1;
		int oper = 0; // update bit to 1 , else bit to 0

		int bitMask = 1 << pos;
//		set oper
		if (oper == 1) {

			int newNumber = bitMask | n;
			System.out.println(newNumber);
		} else {
//			clear
			int newbitMask = ~(bitMask);
			int newNumber = newbitMask & n;
			System.out.println(newNumber);
		}

	}
}