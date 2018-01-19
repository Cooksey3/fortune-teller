import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
//		System.out.println("Please write your first name: ");
//		String firstName = input.nextLine(); 
//		
//		System.out.println("Please write your last name: ");
//		String lastName = input.nextLine();
//		
//		System.out.println("Please write your birth month: ");
//		String birthMonth = input.nextLine();
//		
		
		System.out.print("Please write your age: ");
		int age = input.nextInt(); 

		System.out.print("Please write your number of siblings: ");
		int numberOfSiblings = input.nextInt(); 

		System.out.println("Please write your favorite ROYGBIV color or \"help\": ");
		String favoriteColor = input.nextLine();

	}

}
