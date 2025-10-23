package test;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		/*
		System.out.println("------ 소개 ------");
		
		String name = "정규원";
		System.out.println("이름 : " + name);

		int age = 30;
		System.out.println("나이 : " + age + "세");
		
		String address = "서울 중랑구";
		System.out.println("주소 : " + address);
		
		double weight = 70.5;
		System.out.println("몸무게 : " + weight + "kg");
		*/
		
		
	    Scanner sc = new Scanner(System.in);
	    
	    String name = sc.nextLine();
	    System.out.println("이름 : " + name);
	    
	    int age = Integer.parseInt(sc.nextLine());
	    System.out.println("나이 : " + age + " 세");
	    
	    String address = sc.nextLine();
	    System.out.println("주소 : " + address);
	    
	    double weight = Double.parseDouble(sc.nextLine());
	    System.out.println("몸무게 : " + weight + " kg");
	    
	    System.out.println("end!!");
	    
	}

}
