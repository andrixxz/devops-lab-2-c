import java.util.Scanner;

public class HelloWorld{

	public static void main(String[] args){

		System.out.println("Welcome!!");
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int largest = number;
		int smallest = number;

		for (int i = 1; i < 5; i++){
		System.out.println("Enter another number: ")
		number = scanner.nextInt();
	

		if (number > largest){
			largest = number;
		}
		if (number < smallest){
			smallest = number;
		}
	}
	
	System.out.println("Largest number: " + largest);
	System.out.println("Smallest number" + smallest)

	scanner.close();
	}
}		

