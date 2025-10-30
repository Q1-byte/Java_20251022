package ex12;

public class Car {

	private String color;
	private String gearType;
	private int door;
	
	Car(){
		this("white","auto",4);
		//이런식으로 사용하면 항상 앞줄에 사용해야한다!
	}
	
	Car(String color){
		this.color = "color";
		this.gearType = "auto";
		this.door = 4;
	}
	
	Car(String color, String gearType){
		this.color = "color";
		this.gearType = "gearType";
		this.door = 4;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
