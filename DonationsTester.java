package xneomorph;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {
	public static void main(String[] args) throws FileNotFoundException {
		// Donations ds = new Donations();
		// ds.display();
		
		System.out.println("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		Scanner in = new Scanner(System.in);
		//boolean userInput = in.nextBoolean();
		String choice = in.next();

		if (choice.equalsIgnoreCase("Yes")) {
			

			Donations giveToMe = new Donations();
			System.out.println("Test");

			File inputFile = new File("Donations.txt");
			String category = "";
			Double ammount = 0.0;
			Scanner JK = new Scanner(inputFile);
			while (JK.hasNextLine()) {
				String what = JK.nextLine();
				if (what.startsWith("<individual donation>"))
					category = "individual ";
				else if (what.startsWith("<business donation>"))
					category = "business";
				else if (what.startsWith("<other donation>"))
					category = "other";
				else if (what.equals("<EOF>"))
					break;

				ammount = Double.parseDouble(what.replaceAll("[^0-9|^-]", " "));
				// System.out.println(value)
				giveToMe.processDonations(category, ammount);
			}
			giveToMe.getStatistics();
		}
	 
	else  { 			System.out.println("Ending now without processing donations");}
		in.close();

	}
}
