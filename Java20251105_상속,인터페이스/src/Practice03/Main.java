package Practice03;

public class Main {

	public static void main(String[] args) {

		Animal an1 = new Cat("루시",2);
		an1.makeSound();
		an1.showInfo();
		
		Animal an2 = new Dog("동구",5);
		an2.makeSound();
		an2.showInfo();
		
	}

}
