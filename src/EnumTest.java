enum Planet{
	MERCURY(1),VENUS(2),EARTH(3),MARS(4),JUPITER(5),SATURN(6),URANUS(7),NEPTUNE(7),PLUTO(8);
	
	int number;
	
	Planet(int number)
	{
		this.number = number;
	}
}

public class EnumTest {

	public static void main(String[] args) {
		Planet myPlanet = Planet.EARTH;		
		
		LivePlanet(myPlanet);
	}
	
	static void LivePlanet(Planet myPlanet){
		switch(myPlanet) {
		case EARTH:
			System.out.println("You can live here");
			System.out.println("This is planet no. " + myPlanet.number);
			break;
		default:
			System.out.println("You can't live here");
			System.out.println("This is planet no. " + myPlanet.number);
			break;
		}
	}

}
