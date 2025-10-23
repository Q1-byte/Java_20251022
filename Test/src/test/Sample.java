package test;

public class Sample {

	public static void main(String[] args) {
    
	    System.out.println("Hello, Java");
	    System.out.println("Hello, Java");
	    
	    char var1 = 'A';
	    char c1 = 97;
	    
	    char var2 = '가';
	    // char c2 = 44032;
	    //char c2 = 0xD7A3;
	    char c2 = 55203;
	    
	    System.out.println(var1);
	    System.out.println(c1);
	    
	    System.out.println(var2);
	    System.out.println(c2);
	    
	    float f1 = 10.5f;
	    
	    double d1 = 10.5;
	    
	    System.out.println(f1);
	    System.out.println(d1);
	    
	    double f2 = 2147483648l;
	    double f3 = 2147483658l;
	    double f4 = 2147483668l;
	    System.out.println(f2);
	    System.out.println(f3);
	    System.out.println(f4);
	    
	    String str1 = "정\t규\"원";
	    String str2 = "홍\n길\n동";
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    
	    //자동 형변환
	    System.out.println("----자동형변환----");
	    int intA=10000;
	    byte byteB = 20;
	    
	    //intA= byteB;
	    
	    System.out.println(intA);
	    System.out.println(byteB);
	    
	    //강제 형변환
	    System.out.println("----강제형변환----");
	    byteB = (byte)intA;
	    
	    System.out.println(intA);
	    System.out.println(byteB);
	    
	    System.out.println("----실수형변환----");
	    
	    double dNum = 20.5;
	    int iNum = 10;
	    dNum = iNum;    // 자동형변환 dNum = (double)iNum > dNum = 10.0
	    System.out.println("dNum : " + dNum);
	    
	    dNum = 20.5;
	    iNum = (int)dNum;   // 강제형변환 iNum = (int)dNum > iNum = 20
	    System.out.println("iNum : " + iNum);
	    
	    System.out.println("----정수나누기----");
	    /*
	     * 정수 x 정수 = 정수
	     * 정수 x 실수 = 실수
	     * 실수 x 실수 = 실수
	     * 정수 x 문자열 = 문자열
	     * 실수 x 문자열 = 문자열
	     */
	    
	     int iNum2 = 5;
	     int iNum3 = 2;
	     
	     dNum = iNum2 / iNum3;
	     System.out.println("dNum : " + dNum);
	     
	     dNum = (double)iNum2 / iNum3;
	     System.out.println("dNum : " + dNum);
	    
	     dNum = iNum2 / (double)iNum3;
	     System.out.println("dNum : " + dNum);
	     
	     dNum = (double)iNum2 / (double)iNum3;
	     System.out.println("dNum : " + dNum);
	     
	     /*
	      * 이름 명명
	      * 
	      * 나이 : a (x), age (o)
	      * 
	      * 클래스명 기입 > 사람 클래스 > Person
	      * 
	      * 변수명, 클래스명 > 영문대소문자, 숫자, 특수문자 조항에서 만들수있음
	      * 단, 숫자는 맨 앞에 기입할 수 없다, 예약어는 사용할 수 없다.
	      * ex) age1(o)
	      *    _age1(o)
	      *    $age1(o)
	      *     1age(x)
	      */
	     
	     
	}

}
