package ex07;

public interface Animal {
	
	void sound ();

}

interface MoveMent {
	
	void move ();
}

class Dog implements Animal, MoveMent{

	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
	
	@Override
	public void move() {
		System.out.println("강아지가 달립니다!");
	}
}

class Cat implements Animal, MoveMent{

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	@Override
	public void move() {
		System.out.println("고양이가 살금살금 걷습니다~");
	}
}

class Bird implements Animal, MoveMent{

	@Override
	public void sound() {
		System.out.println("짹! 짹!");
	}
	@Override
	public void move() {
		System.out.println("새가 하늘을 날아가요~");
	}
	
}
