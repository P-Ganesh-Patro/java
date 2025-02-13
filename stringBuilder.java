package DSA_java;

public class stringBuilder {
	public static void main(String[] args) {
		/*
		 * StringBuilder sb = new StringBuilder("apna college"); System.out.println(sb);
		 * 
		 * System.out.println(sb.charAt(2)); //setaCharAt sb.setCharAt(2, 'm');
		 * 
		 * System.out.println(sb); //insert(index num, 'char'); sb.insert(2, 'n');
		 * System.out.println(sb);
		 * 
		 * // delete(start index, end index) sb.delete(2, 3); System.out.println(sb);
		 * 
		 * // append(add in last ) sb.append(' '); sb.append('e'); sb.append('d');
		 * sb.append('u');
		 * 
		 * System.out.println(sb); System.out.println(sb.length());
		 */ 
//		reverse string
		StringBuilder sb = new StringBuilder("ganesh");
		for (int i = 0; i < sb.length() / 2; i++) {
			int start = i;
			int end = sb.length() - 1 - i;

			char startChar = sb.charAt(start);
			char endChar = sb.charAt(end);

			sb.setCharAt(start, endChar);
			sb.setCharAt(end, startChar);

		}
		System.out.println(sb); 

	}

}
