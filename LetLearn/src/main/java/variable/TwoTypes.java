package variable;

public class TwoTypes {
	
	int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTypes va = new TwoTypes();
		va.add(10, 20);
	}
	
	
	
	public void add(int a , int b) {
		int c=20;
		System.out.println(a+b+this.c);
		
	}

}
