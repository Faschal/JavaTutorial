
public class GenericTest {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.4, 5.5, 3.5, 4.4, 3.3};
		Character[] charArray = {'d', 'a', 'w'};
		String[] stringArray = {"gundam", "eva", "path"};
			
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
//		System.out.println(getFirstEle(intArray));
//		System.out.println(getFirstEle(doubleArray));
//		System.out.println(getFirstEle(charArray));
//		System.out.println(getFirstEle(stringArray));
		
		MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
		MyGenericClass<Double> myDoubele = new MyGenericClass<>(3.14);
		
		System.out.println(myInt.getVal());
		System.out.println(myDoubele.getVal());
		
	}
	
	public static <T> void displayArray(T[] array) {
		for(T x : array) {
			System.out.println(x + " ");
		}
		System.out.println();
	}
	
	public static <T> T getFirstEle(T[] array) {
		return array[0];
	}

}
