package xneomorph;

import java.util.Scanner;

public class Donations {

	private double numIndividual = 0;
	private double amtIndividual = 0;

	private double numBusiness  = 0;
	private double amtBusiness  = 0;

	private double numOther = 0;
	private double amtOther = 0;

	

	public void processDonations(String cat, Double amt) {
		if (cat.equals("individual ")) {
			amtIndividual = amtIndividual + amt;
			if (amt < 0)
				numIndividual = numIndividual - 1;
			else
				numIndividual = numIndividual + 1;
		}

		if (cat.equals("business")) {
			amtBusiness  = amtBusiness  + amt;
			if (amt < 0)
				numBusiness  = numBusiness  - 1;
			else
				numBusiness  = numBusiness  + 1;
		}

		if (cat.equals("other")) {
			amtOther = amtOther + amt;
			if (amt < 0)
				numOther = numOther - 1;
			else
				numOther = numOther + 1;
		}
	}

	public void getStatistics() {
		System.out.println("Number of donations for individual: " + numIndividual);
		System.out.println("Number of donations for buisness: " + numBusiness );
		System.out.println("Number of donations for other: " + numOther);
		System.out.println("Total donations for individual: " + amtIndividual);
		System.out.println("Total donations for buisness: " + amtBusiness );
		System.out.println("Total donations for other: " + amtOther);
	}

}
