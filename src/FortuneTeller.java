import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Step 1: Get user input (full name, age, color, birth month, sib no.)
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();

		if (firstName.trim().toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();

		if (lastName.trim().toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		System.out.print("Enter your age in years: ");
		String age = input.nextLine();

		if (age.trim().toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		} else {
			Integer.parseInt(age);
		}

		System.out.print("Please write your favorite ROYGBIV color or \"help\" for help: ");
		String favoriteColor = input.nextLine();

		if (favoriteColor.trim().toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		// // Help in case user doesn't understand ROYGBIV
		while (favoriteColor.toLowerCase().trim().equals("help")) {
			System.out.println("The ROYGBIV colors are: Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			System.out.print("Please write your favorite ROYGIBV color: ");
			favoriteColor = input.nextLine();
			if (favoriteColor.trim().toLowerCase().equals("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} 
		}

		System.out.print("Enter the number of your birth month: ");
		String birthMonth = input.nextLine();

		if (birthMonth.trim().toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		} else {
			Integer.parseInt(birthMonth);
		}

		System.out.print("Enter your number of siblings: ");
		String numberOfSiblings = input.nextLine();

		if (numberOfSiblings.trim().toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		} else {
			Integer.parseInt(numberOfSiblings);
		}
		// Step 2: Fortunes based on user input (years to retirement, bank
		// balance, retirement location, mode of transportation)
		int numberOfYears;

		if (Integer.parseInt(age) % 2 == 1) {
			numberOfYears = 20;
		} else if (Integer.parseInt(age) <= 0) {
			numberOfYears = 999;
		} else {
			numberOfYears = 2;
		}

		double bankBalance;

		if (Integer.parseInt(birthMonth) == 1 || Integer.parseInt(birthMonth) == 2) {
			bankBalance = 4000000.00;
		} else if (Integer.parseInt(birthMonth) == 3 || Integer.parseInt(birthMonth) == 4) {
			bankBalance = 250000.00;
		} else if (Integer.parseInt(birthMonth) == 5 || Integer.parseInt(birthMonth) == 6) {
			bankBalance = 10.00;
		} else if (Integer.parseInt(birthMonth) == 7 || Integer.parseInt(birthMonth) == 8) {
			bankBalance = 600000.00;
		} else if (Integer.parseInt(birthMonth) == 9 || Integer.parseInt(birthMonth) == 10) {
			bankBalance = 950.33;
		} else if (Integer.parseInt(birthMonth) == 11 || Integer.parseInt(birthMonth) == 12) {
			bankBalance = 99999999999.00;
		} else {
			bankBalance = -3000.00;
		}

		String location;

		if (Integer.parseInt(numberOfSiblings) == 0) {
			location = "Beijing, China";
		} else if (Integer.parseInt(numberOfSiblings) == 1) {
			location = "San Francisco, CA";
		} else if (Integer.parseInt(numberOfSiblings) == 2) {
			location = "Paris, France";
		} else if (Integer.parseInt(numberOfSiblings) == 3) {
			location = "Barcelona, Spain";
		} else if (Integer.parseInt(numberOfSiblings) > 3) {
			location = "the rolling plains of New Zealand";
		} else {
			location = "a frozen wasteland with shorts and a t-shirt";
		}

		String transportation;

		if (favoriteColor.toLowerCase().trim().equals("red")) {
			transportation = "tuk tuk";
		} else if (favoriteColor.toLowerCase().trim().equals("orange")) {
			transportation = "dune buggy";
		} else if (favoriteColor.toLowerCase().trim().equals("yellow")) {
			transportation = "private jet";
		} else if (favoriteColor.toLowerCase().trim().equals("green")) {
			transportation = "hyperloop";
		} else if (favoriteColor.toLowerCase().trim().equals("blue")) {
			transportation = "McClaren 720";
		} else if (favoriteColor.toLowerCase().trim().equals("indigo")) {
			transportation = "pickup truck";
		} else if (favoriteColor.toLowerCase().trim().equals("violet")) {
			transportation = "skateboard";
		} else {
			transportation = "foot";
		}

		// Step 3: Final fortune
		System.out
				.println(firstName + " " + lastName + " will retire in " + numberOfYears + " year, with $" + bankBalance
						+ " in the bank, a vacation home in " + location + " and travel by " + transportation + ".");

		input.close();
	}

}
