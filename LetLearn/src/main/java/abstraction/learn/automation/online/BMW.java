package abstraction.learn.automation.online;

public class BMW extends Car {
	
	@Override
	public void companyvault() {
		System.out.println("BMW's Company vault");
	}
	@Override
	public void EngineSecret() {
		System.out.println("BMW's Engine secret");
	}
	@Override
	public void EmployeeSecret() {
		System.out.println("BMW's Employee secret");
	}
	
	public static void main(String[] args) {
		
		Car car = new BMW();
		car.companyvault();
		car.EmployeeSecret();
		car.EngineSecret();
		car.mobileSecret();
	}
	@Override
	public void interior() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exterior() {
		// TODO Auto-generated method stub
		
	}
	
	

}
