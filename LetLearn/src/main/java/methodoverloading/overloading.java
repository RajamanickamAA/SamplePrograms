package methodoverloading;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading work = new overloading();
		work.callguru(7768);
		work.callguru("guru");
		
	}
	
	public void callguru(int num) {
		System.out.println(num);
	}
	
	private void callguru(String name) {
		System.out.println(name);
	}

}
