package DSA_FGF;

public class reverseAndRotationsOfString {
	public static void main(String[] args) {

		String s1 = "ganesh";
		int len = s1.length();
		System.out.println(len);

		StringBuffer sb;

		for (int i = 0; i < len; i++) {
			sb = new StringBuffer();

			int j = i;
			int k = 0;

			System.out.println("after");
			// Generate the first part from index i to end of the string
			for (int k2 = j; k2 < len; k2++) {
				sb.insert(k, s1.charAt(j)); // Insertion at k
				k++;
				j++;
				System.out.println("inner loop " + i + " " + j + "  " + k);
			}

			// Generate the second part from the start of the string to index i-1
			j = 0;
			System.out.println("i " + i);
			System.out.println("j " + j);
			System.out.println("k " + k);
			while (j < i) {
				sb.insert(k, s1.charAt(j)); // Insertion at k
				j++;
				k++;
			}

			System.out.println(sb.toString());
		}
	}
}
