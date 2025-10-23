package test;

public class Sample2 {

	public static void main(String[] args) {
		
		Person p = new Person();
		
			p.name = "정규원";
			p.age = 20;
		
				System.out.println(p.name);
				System.out.println(p.age);
		
		Student s = new Student();
		
			s.학과 = "무화과";
			s.학번 = "20251022";
		
				System.out.println(s.학과);
				System.out.println(s.학번);
	}

}


class Person{
	String name;
	int age;
	
	void funcA() {}
	void funcB() {}
	void funcC() {}
}

class Student{
	String 학번;
	String 학과;
}