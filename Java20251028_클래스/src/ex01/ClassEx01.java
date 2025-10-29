package ex01;

public class ClassEx01 {

	public static void main(String[] args) {
		
		student s1 = new student();
		s1.name = "안창현";
		s1.age = 29;
		s1.address = "강동구 천호동";
		
		System.out.println(s1.name);
		//System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		
		System.out.println("---------------");
		
		student s2 = new student();
		s2.name = "선아영";
		s2.age = 28;
		s2.address = "강동구 암사동";
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.address);
		s2.study();
		
		
	}

}

/*
 *  클래스 - 멤버변수(속성), 멤버 메소드(함수)
 *  멤버변수 - 정적, 멤버메소드-동적(행동)
 */
class student{
	String name;
	int age;
	String address;
	
	public void study() {
		System.out.println(name + " Jaba 공부 중 입니다.");
	}
	public void eat() {
	System.out.println(name + "아침을 먹는다!");
	}
}
