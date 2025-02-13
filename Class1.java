package DSA_java;

//recursion
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int c = 0;
		recursion(c);

	}

	public static void recursion(int c) {

		int a = 5 + 6;
		if (c == 33) { // base condition
			System.out.println("count " + c);
			return;
		}

		c++;
//		++c;
		recursion(c);

	}

}
