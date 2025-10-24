package ex01;

public class ForEx02 {

	public static void main(String[] args) {

		int sum=0;
		
		
		/*
		 * 1~100까지 짝수 합
		
		
		for(int i=0; i<=100; i +=2) {
			sum += i;
		}
		*/
	    
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0)
				sum += i;
		}
		System.out.println("합 :" + sum);
	}

}

		/*
		 * for(초기값; 조건; 증가값)
		 * 	조건만하면 실행될 코드
	 	 * <실행 순서>
	 	 *  처음 : 초기값 > 조건 > 실행코드 > 증가값
	 	 *  이후 : 조건 > 실행코드 > 증가값
	 	 */