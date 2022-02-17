import java.util.Scanner;

public class MicrowaveTester {

	public static void main(String[] args) {

		Microwave myMicrowave = new Microwave();
		Scanner MicrowavePannel = new Scanner(System.in);

		System.out.println("Thank you for purchasing the warm up your food machine created by Graham co.");
		System.out.println("Your menu format is as follows:");
		System.out.println("");
		System.out.println("Press 1 to increase the time in increments of 30.");
		System.out.println("Press 2 to change the power level 1 to level 2 or level 2 to level 1.");
		System.out.println("Press 3 to view current timer and power level");
		System.out.println("Press 4 to reset power level and time to default levels.");
		System.out.println("Press 5 to start the microwave.");
		System.out.println("Press 6 to see the menu again.");
		System.out.println("Press 9 to stop using the microwave.");
		System.out.println("");
		System.out.println("Please enter your choice: ");
		int user = 0;

		while (MicrowavePannel.hasNext() == true && user != 9) {

			user = MicrowavePannel.nextInt();
			if (user == 9) {
				System.out.println("Microwave has been issued to stop have a nice day.");
				break;
			}

			if (user == 1) {
				myMicrowave.timeButton();
				myMicrowave.displayTime();

			} else if (user == 2) {
				myMicrowave.powerButton();
				myMicrowave.displayPower();

			} else if (user == 3) {
				myMicrowave.displayTimePower();

			} else if (user == 4) {
				myMicrowave.resetButton();
				myMicrowave.displayTimePower();

			} else if (user == 5) {
				myMicrowave.startButton();
				System.out.println();

			} else if (user == 6) {
				System.out.println("Press 1 to increase the time in increments of 30.");
				System.out.println("Press 2 to change the power level 1 to level 2 or level 2 to level 1.");
				System.out.println("Press 3 to view current timer and power level");
				System.out.println("Press 4 to reset power level and time to default levels.");
				System.out.println("Press 5 to start the microwave.");
				System.out.println("Press 6 to see the menu again.");
				System.out.println("Press 9 to stop using the microwave.");
				System.out.println("");
				System.out.println("Please enter your choice: ");

			}

		}
		MicrowavePannel.close();
	}

}
