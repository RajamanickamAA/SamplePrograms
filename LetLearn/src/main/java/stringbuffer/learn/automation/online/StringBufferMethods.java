package stringbuffer.learn.automation.online;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder("Rajamanickam");
		
		System.out.println(name.append("Perumal"));
		
		System.out.println(name.reverse());
		
		System.out.println(name.reverse());
		
		System.out.println(name.replace(0, 4, "Mohith"));
		
		System.out.println(name.delete(0, 6));
		
		System.out.println(name.insert(0, "Raja"));
		
		System.out.println(name.capacity());
		System.out.println(name.charAt(1));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(0,4));
		
		
				
	}

}
