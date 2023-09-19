package abstraction.learn.automation.online;

public class Benz extends Car{
	
	@Override
	public void companyvault() {
		System.out.println("Benz company vault");
	}
	@Override
	public void EngineSecret() {
		System.out.println("Benz Engine secret");
	}
	@Override
	public void EmployeeSecret() {
		System.out.println("Benz Employee secret");
	}
	
	public static void main(String[] args) {
		Car car = new Benz();
		car.companyvault();
		car.EmployeeSecret();
		car.EngineSecret();
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
