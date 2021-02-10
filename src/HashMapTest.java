import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> countries = new HashMap<String, String>();
		
		countries.put("Indonesia", "Jakarta");
		countries.put("USA", "Washington DC");
		countries.put("Germany", "Berlin");
		countries.put("Japan", "Tokyo");
		countries.put("New Zealand", "Welington");
		
//		countries.remove("Germany");
//		countries.replace("Japan", "Kyoto");		
		
//		System.out.println(countries.size());
//		System.out.println(countries.containsKey("England"));
//		System.out.println(countries.containsValue("London"));
		
		for(String i : countries.keySet()) {
			System.out.print(i+ "\t"+"= ");
			System.out.println(countries.get(i));
		}
	}

}
