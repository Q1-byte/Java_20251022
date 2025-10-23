package test;

public class Example02 {

	public static void main(String[] args) {
		
		/*
		 * ---------출력 예시---------
		 * 이름 : 본인이름      : name
		 * 나이 : 25          : age
		 * 주소 : 서울시 ~      : address
		 * 몸무게 : 70.5kg     : weigt
		 */
		
		System.out.println("------ 소개 ------");
		
		String name = "정규원";
		System.out.println("이름 : " + name);

		int age = 30;
		System.out.println("나이 : " + age + "세");
		
		String address = "서울 중랑구";
		System.out.println("주소 : " + address);
		
		double weight = 70.5;
		System.out.println("몸무게 : " + weight + "kg");
		
		
	}

}
