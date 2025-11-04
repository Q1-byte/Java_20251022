package ex08_3_추상클래스;

public class ElectricCar extends Car {
	
	@Override
	public void fillup() {
		System.out.println("전기를 충전합니다.");
   }
}
