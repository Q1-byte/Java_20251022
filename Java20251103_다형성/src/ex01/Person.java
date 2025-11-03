package ex01;

public class Person {
	private String name;
	private int age;
	
	Person(){}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public String info() {
		return name + " , " + age;
	}
	
}
