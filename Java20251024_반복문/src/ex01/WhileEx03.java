package ex01;

public class WhileEx03 {

	public static void main(String[] args) {

		/*
		int sum=0;
		
		for(int i=1; i<=5; ++i) {
			sum +=i;
		}
		System.out.println("합 :" + sum);
		*/
		
		int sum=0;
		int i=1; 
		
		while(i<=5)   
			sum += i++;    //한줄에 줄여서 쓰는건 비추
		
		
		System.out.println("합 :" + sum);
	}

}
