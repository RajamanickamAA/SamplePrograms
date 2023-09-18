package episode6;

public class Mobile {
	static String a = "Samsung phone looks bad in design and performance";
	
	public void Samsung() {
		System.out.println("Samsung phone is beautiful in design");
	}
	
	public void iPhone() {
		System.out.println("Iphone is only for high class people");

	}
	
	public void Samsung(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Mobile phone = new Mobile();
		phone.Samsung();
		phone.Samsung(a);
		phone.iPhone();
		
	}
}
