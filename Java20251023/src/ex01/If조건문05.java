package ex01;

import java.util.Scanner;

public class If조건문05 {

	public static void main(String[] args) {
		/*
		 * 버스 요금 계산표
		 * 요금 : 2000
		 * 65세이상 : 무료
		 * 20 ~ 64 : 할인율 0%
		 * 15 ~ 19 : 할인율 20%
		 * 7 ~ 14 : 할인율 50%
		 * 6 미만 : 무료
		 */
		
		int age = 25;
		int fee = 2000;
		double rate = 0;
		
		if(age>65) {
			fee = 0; // 노인 무료
		}else if( age>=20 && age<65 ) {
			rate = 0; // 일반 요금 (할인 없음)
		}else if( age>=15 && age<20 ) {
			rate = 0.2; // 청소년 20% 할인
		}else if( age>=7 && age<15 ) {
			rate = 0.5;  // 어린이 50% 할인
		}else { 
			fee = 0; // 유아 무료
		}
		
		if( fee != 0 && rate > 0 ) {
			fee = (int)(fee *(1 - rate));
		}
		
		System.out.println("나이 " + age + "세는 요금" + fee + "원 입니다. ");
		
				
			System.out.println("------ The end ------");
		
	}

}
