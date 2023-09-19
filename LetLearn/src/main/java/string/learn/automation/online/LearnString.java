package string.learn.automation.online;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = " Rajamanickam";
		long num = 7768085902L;
		
		System.out.println(name.charAt(0));
		
		System.out.println(name.length());
		
		System.out.println(name.equals("Raja"));
		
		System.out.println(name.equalsIgnoreCase("rajamanickam"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.contains("a"));
		
		System.out.println(name.replace("R", "r"));
		
		System.out.println(name.replace("Raja", "Mohith"));
		
		System.out.println(name.indexOf("m"));
		
		System.out.println(name.indexOf("m", 5));
		
		System.out.println(name.indexOf('m', 5));
		
		System.out.println(name.trim());
		
		System.out.println(String.valueOf(num));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(String.join("/", "05","06","1988"));
		
		String splitthis = "apple, banana, orange";
		String[] fruits = splitthis.split(",");
		for (String value : fruits) {
			System.out.println(value);
			
		}
		
		System.out.println(name.concat("Automation"));
		
		

	}

}
