package ex01;

public class WhileEx02 {

	public static void main(String[] args) {

		/*
		int sum=0;
		
		for(int i=1; i<=5; ++i) {
			sum +=i;
		}
		System.out.println("합 :" + sum);
		*/
		
		int sum=0;
		int i=1; //초기값
		
		while(i<=5) {  //조건
			sum += i;
			i++;  //증가
		}
		
		System.out.println("합 :" + sum);
	}

}
