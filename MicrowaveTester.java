import java.util.Scanner;

public class MicrowaveTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create microwave object
		Microwave myMicrowave = new Microwave();
		Scanner MicrowavePannel = new Scanner(System.in);

		System.out.println("Thank you for purchasing the warm up your food machine created by Graham co.");
		System.out.println("Your menu format is as follows:");
		System.out.println("");
		System.out.println("Press 1 to increase the time in incriments of 30.");
		System.out.println("Press 2 to change the power level 1 to level 2 or level 2 to level 1.");
		System.out.println("Press 3 to veiw current timer and power level");
		System.out.println("Press 4 to reset power level and time to default levels.");
		System.out.println("Press 5 to start the microwave.");

		/**
		 * allow user to control all
		 * 
		 * // enter 1 for the power button 2 for the TimeButton 3 startButton 4 for
		 **/ // the reset button

		int user = MicrowavePannel.nextInt();

		
	while (MicrowavePannel.hasNext() == true ) 
	{
		if (user == 1) 
		{ myMicrowave.timeButton();
		myMicrowave.displayTime();}
		else if (user == 2) 
		{ myMicrowave.powerButton();
			myMicrowave.displayPower(); }
		else if (user == 3) 
		{ myMicrowave.displayTimePower();}
					
		else if (user == 4) 
		{ myMicrowave.resetButton();
		 myMicrowave.displayTimePower();}
		
		else if (user == 5) 
		{ myMicrowave.startButton();
			System.out.println(); }
	} 
	
		/**
		 * // hit the powerButton myMicrowave.powerButton(); // int powerChoice =
		 * MicrowavePannel.nextInt(); // hit the TimeButton myMicrowave.timeButton(); //
		 * int timeChoice = MicrowavePannel.nextInt(); // hit the startButton
		 * myMicrowave.startButton(); // int startChoice = MicrowavePannel.nextInt(); //
		 * hit the resetButton myMicrowave.resetButton(); // int resetChoice =
		 * MicrowavePannel.nextInt();
		 **/
	}

}
