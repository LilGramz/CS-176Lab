package homework;

import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Measurements = new Scanner(System.in);

		System.out.println("Please enter the cost per square foot: ");
		double costPerSquareFoot = Measurements.nextInt();

		System.out.println("Please enter the length of the house: ");
		int houseLength = Measurements.nextInt();

		System.out.println("Please enter the width of the house: ");
		int houseWidth = Measurements.nextInt();

		System.out.println("Please enter the height of the house: ");
		int houseHeight = Measurements.nextInt();

		System.out.println("Please enter the number of windows: ");
		int numOfWindows = Measurements.nextInt();

		System.out.println("Please enter the length of the window: ");
		int windowLength = Measurements.nextInt();

		System.out.println("Please enter the width of the window: ");
		int windowWidth = Measurements.nextInt();

		System.out.println("Please enter the number of doors: ");
		int numOfDoors = Measurements.nextInt();

		System.out.println("Please enter the length of the door: ");
		int doorLength = Measurements.nextInt();

		System.out.println("Please enter the width of the door: ");
		int doorWidth = Measurements.nextInt();

		double HouseAreaPeakSide = houseLength * houseWidth + .5 * (houseLength * (houseHeight - houseWidth));
		int houseAreaNormalSide = houseLength * houseWidth;
		double houseArea = (HouseAreaPeakSide * 2) + (houseAreaNormalSide * 2);
		int windowArea = windowLength * windowWidth;
		int doorArea = doorLength * doorWidth;
		int windowTotal = windowArea * numOfWindows;
		int doorTotal = doorArea * numOfDoors;
		int unpaintable = doorTotal + windowTotal;
		double paintable = houseArea - unpaintable;
		double costTotal = costPerSquareFoot * paintable;

		System.out.println("Your total paintable surface area is " + paintable + " square feet");
		System.out.println("Your estimate is " + costTotal + " dollars");

	}

}
