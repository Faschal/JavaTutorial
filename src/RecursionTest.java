import java.util.Scanner;

public class RecursionTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		
		HelloWorld(number);

	}
	
	static void HelloWorld(int num) {
		if (num > 0) {
			System.out.println("Hello World " + num);
			num--;
			HelloWorld(num);			
		}
		
	}

}
