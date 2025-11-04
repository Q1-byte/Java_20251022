package ex01;

public class ForEx06 {

	public static void main(String[] args) {
		
		/*
		 *  2~5단 까지 구구단 출력
		 *  2단 두개
		 *  3단 세개
		 *  4단 네개
		 *  5단 다섯개
		 */
		
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				
				System.out.println(i + " X " + j + " = " + i*j);
				
				if(i == j) break;
			}
			System.out.println("-----------------");
		}
		
		
	}

}
