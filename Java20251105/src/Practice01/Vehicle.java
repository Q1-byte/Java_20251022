package Practice01;

public class Vehicle {

	private String brand;
	private int year;
	
	public Vehicle () {}
	public Vehicle (String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
	public void showInfo() {
		System.out.println("브랜드: " + brand + ", "+"연식: " + year +"년");
		// System.out.printf("브랜드: %s, 연식: %d년", brand, year);
	}
}
