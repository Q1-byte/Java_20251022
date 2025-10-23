package ex01;

import java.util.Scanner;

public class If조건문04 {

	public static void main(String[] args) {
		/*
		 * number >= 90 ~A
		 * number >= 80 ~B
		 * number < 80 ~C
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("점수를 입력하세요!!!");
		System.out.println("당신의 점수는?");
		
		int number = sc.nextInt();
		
		if(number >= 90) {
			System.out.println("A학점 이네!");
			try {Thread.sleep(1500);}
			catch(InterruptedException e) {e.printStackTrace();}
			System.out.println("정말 대단하구나!");
			System.out.println();
		}else {
			if(number >= 80) {
				System.out.println("B학점 좋네");
				try {Thread.sleep(1500);}
				catch(InterruptedException e) {e.printStackTrace();}
				System.out.println("좀 더 노력하면 좋아질거야!");
				System.out.println();
			}else {
				System.out.println("C학점 이라니");
				try {Thread.sleep(1500);}
				catch(InterruptedException e) {e.printStackTrace();}
				System.out.println("열심히 하자...");
				System.out.println();
			}
		}

		try {Thread.sleep(1500);}
		catch(InterruptedException e) {e.printStackTrace();}
		
			System.out.println("------ 프로그램종료 ------");
		
	}

}
