package DSA_java;

// print names 5 times
//print linearly from 1 to N
// print from N to 1
//print linearly from 1 to N
// print from N to 1 (backtrack)
public class recursion {
	public static void main(String[] args) {
//		name5("ganesh", 0);
//		numberN(0, 5, 0);
//		numberNto1(4, 1);
//		linear1toN(3, 3);
		linearNto1(1, 3);
	}

	public static void name5(String name, int c) {
		if (c == 5) {
			System.out.println("count " + 5);
			return;
		}
		System.out.println(name);
		c++;
		name5(name, c);
	}

	public static void numberN(int num, int n, int c) {
		if (num == n) {
			System.out.println("count " + c);
			return;
		}
		num++;
		System.out.println(num);

		numberN(num, n, c);
	}

	public static void numberNto1(int n, int num) {
		if (num == n) {
			System.out.println(" n " + n);
			return;
		}
		System.out.println(" n " + n);
		n--;
//		System.out.println(" num " +num);
		numberNto1(n, num);

	}

//linearly (backtrack)

	public static void linear1toN(int i, int n) {
		if (i < 1) {
			return;
		}
		System.out.println("begin");
		linear1toN(i - 1, n);
		System.out.println("start");
		System.out.println(i + "+" + n);

	}

	public static void linearNto1(int i, int n) {
		if (i > n) {
			System.out.println(i);
			return;
		}

		linearNto1(i + 1, n);
		System.out.println(i);

	}
}
