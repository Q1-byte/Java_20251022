package Practice02;

public class Dog extends Animal{

	public Dog () {}
	public Dog (String name, int age) {
		super (name, age);
	}
	@Override // 상위 클래스의 메소드를 오버라이딩 했다표시.
	public void makeSound() {
		System.out.println("멍멍!!");
	}
}

