package revString;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = "123";
		char[] value = S1.toCharArray();
		for (int i = value.length-1; i >= 0; i--) {

			System.out.println(value[i]);

		}
		Integer s1 = 	Integer.valueOf(S1);
		System.out.println(s1);

		String s2 = Integer.toString(s1);
		System.out.println(s2);
		
		char s3 = S1.charAt(1);
		System.out.println(s3);
		
		s1.toString();
		
		
	}

}
