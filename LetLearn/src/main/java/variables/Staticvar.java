package variables;

public class Staticvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvar ls = new Staticvar();
		ls.increase();
		Staticvar ls1 = new Staticvar();
		ls1.increase();

	}

	int a = 1;
	static int b = 1;
	
	void increase() {
		a++;
		b++;
		System.out.println(a + "--->"+b);
	}
	
	
}
