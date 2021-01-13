
public class Oop {

	public static void main(String[] args) {
		Car myCar = new Car("Tesla", "X-1", 2020, "Red", 50000.00);
		Car myCar2 = new Car("Toyota", "Corola", 2019, "Blue", 20000.00);
		
		System.out.println(myCar.color);
		System.out.println(myCar.model);
		System.out.println(myCar.make);
		System.out.println("");
		System.out.println(myCar2.color);
		System.out.println(myCar2.model);
		System.out.println(myCar2.make);
		
		System.out.println(myCar2.drive());
		
	}

}
