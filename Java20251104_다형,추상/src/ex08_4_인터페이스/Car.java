package ex08_4_인터페이스;

public interface Car {
	void move();
		
	default void stop() {
		System.out.println("==끼이이익==");
	}
	
		public abstract void fillup();
	}

