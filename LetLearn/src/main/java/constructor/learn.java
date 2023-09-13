package constructor;

public class learn {
	
	int a;
	String b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learn ls = new learn();
		ls.sum();
		learn ls1 = new learn(10000, "Mohith");
		ls1.sum();
	}
	
	public void sum() {
		System.out.println(a+"---->"+b);
	}
	
	learn(){
		this.a = 1000;
		this.b = "Raja";
	}
	
	learn(int a , String b){
		this.a = a;
		this.b = b;
	}
	

}
