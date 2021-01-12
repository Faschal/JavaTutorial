import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String name = "";
//		
//		while(name.isBlank()) 
//		{
//			System.out.println("Enter your name : ");
//			name = scanner.nextLine();			
//		}
//		
//		System.out.println("Hello " + name);
		
//		for(int i=1; i <= 10; i++)
//		{
//			System.out.println("Number :" + i);
//		}
		
//		System.out.println("Rows : ");
//		int rows = scanner.nextInt();
//		System.out.println("Columns : ");
//		int columns = scanner.nextInt();
//		System.out.println("symbol : ");
//		String symbol = scanner.next();
//		
//		for(int i=1; i<=rows; i++)
//		{
//			System.out.println();
//			for(int j=1; j<=columns; j++)
//			{
//				System.out.print(symbol);
//			}
//		}
		
		String[] animals = {"dog", "bird", "cheetah", "lion"};
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		
	}

}
