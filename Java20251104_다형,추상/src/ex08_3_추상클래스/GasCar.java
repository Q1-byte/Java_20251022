package ex08_3_추상클래스;

public class GasCar extends Car {
	
	@Override
	public void fillup() {
		System.out.println("기름을 주유합니다.");
	}
}