package episode53;

import org.testng.annotations.Test;

public class GropsTestng {
	
	@Test (groups={"smoke"})
	public void Test1() {
		System.out.println("First test case");

	}
	
	@Test (groups = {"reg"})
	public void Test2() {
		System.out.println("Second test case");

	}
	@Test (groups = {"sanity"})
	public void Test3() {
		System.out.println("Third test case");
	}
	@Test (groups = {"smoke"})
	public void Test4() {
		System.out.println("Fourth test case");
	}
	@Test (groups = {"reg"})
	public void Test5() {
		System.out.println("Fifth test case");
	}
	

}
