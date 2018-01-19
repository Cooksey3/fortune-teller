import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please write your first name: ");
		String firstName = input.nextLine(); 
		
		System.out.print("Please write your last name: ");
		String lastName = input.nextLine();
		
//		System.out.println("Please write your favorite ROYGBIV color or \"help\": ");
//		String favoriteColor = input.nextLine();
		
//		if (favoriteColor.toLowerCase().equals("help")) {
//			System.out.println("The ROYGBIV colors are: Red, Orange, Yellow, Green, Blue, Violet");
//			System.out.println("Please write your favorite ROYGIBV color: ");
//			favoriteColor = input.nextLine();
//		}
		
//		System.out.println("Please write your birth month: ");
//		int birthMonth = input.nextInt();
		
		System.out.print("Enter the number of your age: ");
		int age = input.nextInt();

//		System.out.print("Please write your number of siblings: ");
//		int numberOfSiblings = input.nextInt();
		
		int numberOfYears;
		
		if (age % 2 == 1) {
			numberOfYears = 20;
		} else if (age <= 0) {
			numberOfYears = 999;
		} else {
			numberOfYears = 1;			
		}
			
		System.out.println(firstName + " " + lastName + " will retire in " + numberOfYears + " year, ");
				//" with $" + bankBalance + " in the bank, a vacation home in " + location + " and travel by " + car);
			
		}


	}


