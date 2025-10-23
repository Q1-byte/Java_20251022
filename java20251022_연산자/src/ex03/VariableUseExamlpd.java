package ex03;

public class VariableUseExamlpd {

	public static void main(String[] args) {

		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		/*
		 * 연산
		 * 정수 + 정수 = 정수
		 * 실수 + 실수 = 실수
		 * 정수 + 실수 = 실수
		 */
		
		System.out.println( 5 / (double)2 );
		//                          ㄴ 강제형변환
	    // "kor" , "한글" = 문자열
		// 정수 + 문자 = 문자
		// 실수 + 문자 = 문자
		
	}

}
