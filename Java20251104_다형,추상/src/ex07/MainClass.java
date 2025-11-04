package ex07;

public class MainClass {

	public static void main(String[] args) {

		
		MoveMent[] movers = { new Dog(), new Cat(), new Bird()};
		
		for (MoveMent m : movers) {
			m.move();
			
			if (m instanceof Animal) {
				((Animal)m).sound();
			}
			System.out.println("-------------------");
		}
		
	}

}
