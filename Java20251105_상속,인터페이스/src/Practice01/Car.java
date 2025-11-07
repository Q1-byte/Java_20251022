package Practice01;

public class Car extends Vehicle {

	private String type;
	
	public Car () {}
	public Car (String brand, int year, String type) {
		super (brand, year);
		this.type = type;
	}
	public void showCarInfo() {
		super.showInfo();
		System.out.println("차종: " + type);
		
		/*
		public void ShowInfo() {
			System.out.printf("차종: %s\n" , type);
		}
		 */
		}
		
	}
