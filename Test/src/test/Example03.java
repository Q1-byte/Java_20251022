package test;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("이름 : ");
	    String name = sc.nextLine();
	    
	    
	    System.out.print("나이 : ");
	    int age = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.print("주소 : ");
	    String address = sc.nextLine();
	    
	    System.out.print("몸무게 : ");
	    double weight = sc.nextDouble();
	    
	    System.out.println();
	    System.out.println("이름 :" + name);
	    System.out.println("나이 :" + age + "세");
	    System.out.println("주소 :" + address);
	    System.out.println("몸무게 :" + weight + "kg");
	    
	    
	    System.out.println();
	    System.out.println("end!!");
	    
	}

}
