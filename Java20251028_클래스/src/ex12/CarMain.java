package ex12;

public class CarMain {

	public static void main(String[] args) {

		
		
	Car c1 = new Car();	
	/*
	c1.color = "white";
	c1.gearType = "auto";
	c1.door = 4;
	*/
	Car c2 = new Car("white","auto", 4);	
	
	Car c3 = new Car("black");	
	
	Car c4 = new Car("black", "manual1");	
		
	//System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);

	}

}
