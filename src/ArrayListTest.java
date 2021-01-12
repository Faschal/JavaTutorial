import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList<String> foods = new ArrayList<String>();
//		
//		foods.add("Cheese");
//		foods.add("Rice Fried");
//		foods.add("Sate");
//		foods.add("Hamburger");
//		
//		foods.set(0, "Sushi");
//		foods.remove(2);
//		
//		for(int i=0; i<foods.size(); i++)
//		{
//			System.out.println(foods.get(i));
//		}
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		
		bakeryList.add("garlic");
		bakeryList.add("book");
		bakeryList.add("pasta");
		bakeryList.add("donut");
		
		ArrayList<String> produceList = new ArrayList<String>();
		
		produceList.add("tomatoes");
		produceList.add("peppers");
		produceList.add("chili");
		produceList.add("ketchup");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		
		drinkList.add("soda");
		drinkList.add("coffe");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList.get(0).get(3));
		
	}

}
