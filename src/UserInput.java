import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		scanner.nextLine(); 
		
		System.out.println("Enter your favorite food : ");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("Age " + age);
		System.out.println("Food " + food);
	}

}
