import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {			
			
			System.out.println("Enter a number to divide: ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a number to divide by: ");
			int y = scanner.nextInt();
			
			int z = x / y; 
			System.out.println("Result : " + z);
		}
		catch (ArithmeticException e) {
			System.out.println("Can't divide number by zero");
		}
		catch (InputMismatchException e) {
			System.out.println("Must input a number");
		}
		finally {
			scanner.close();
		}
	}

}
