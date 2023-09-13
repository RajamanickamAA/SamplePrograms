package arra;

import java.util.Arrays;

public class LearnArra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "123"};
		System.out.println(Arrays.toString(month));
		int a = month.length;
		System.out.println(a-1);
		String value = (month[a-1]);
		int an = Integer.parseInt(value);
		System.out.println(an);
		
		int raja[] = new int[5];
		raja[0] = 10;
		raja[1] = 20;
		raja[2] = 30;
		raja[3] = 40;
		raja[4]	= 50;
		
		System.out.println(Arrays.toString(raja)); 

	}
	
	

}
