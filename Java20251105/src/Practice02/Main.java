package Practice02;

public class Main {

	public static void main(String[] args) {

		Animal dog1 = new Dog ("초코",3);
		dog1.showInfo();
		dog1.makeSound();
		
		System.out.println("----------------");
		
		Animal cat1 = new Cat ("나비",2);
		cat1.showInfo();
		cat1.makeSound();
		
	}

}
