
public class Car {
	
	String make;
	String model;
	int year;
	String color;
	double price;
	
	Car(String make, String model, int year, String color, double price)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	
	public String drive()
	{	 
		return "drive model " + this.model;
	}
	
}
