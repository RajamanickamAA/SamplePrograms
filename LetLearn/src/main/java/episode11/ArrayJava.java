package episode11;

public class ArrayJava {

	public static void main(String[] args) {

		String[] fruits = {"Apple","Banana","Orange","Pomo","Rasberies","Strawberies"};
		int count = fruits.length;
		System.out.println(count);
		String[] output = fruits.clone();
		int count1 = output.length;
		System.out.println(count1);
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		
		
		

	}

}
