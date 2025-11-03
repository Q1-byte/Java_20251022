package ex04;

public class Main {

	public static void main(String[] args) {

		A a = new A();
			a.test();  // A
			
		a = new B();
			a.test();  // B
			
		a = new C();
			a.test();  // C
		
			System.out.println("---------------------------");
		
		a = new A();
		a.test();   // A
		
		
		a = new B();
		a.test();   // B
		
		a = new C();
		a.test();   // C
		
		System.out.println("---------------------------");
		
		a = new B();
		
		// B b = new A(); x
		B b = (B)a;
		b.test(); // B
		
		System.out.println("---------------------------");
		
		a = new C();
		C c = (C)a;
		c.test(); // C
		
		System.out.println("----------------------------");
		
		A aa = null;
		
		C cc = new C();
		cc.test(); // C
		
		aa = (A)cc;
		aa.test(); // C
		
		C cc1 = (C)aa;
		aa.test(); // C
		
		aa = (B)cc;
		aa.test(); // C
		
	}

}
