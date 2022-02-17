
public class Microwave {
	// increase time by 30 seconds
	// switch between power 1 and 2
	// reset button
	// start button

	// instance variables
	private int time;
	private int power;

	// construction variables
	public Microwave() {
		time = 0;
		power = 1;
	}
	
	public Microwave(int timeIn, int powerIn) {
		time = timeIn;
		power = powerIn;
	}

	// display power method
	public void displayPower() {
		System.out.println("Current power is: " + power);
	}

	// display time method
	public void displayTime() {
		System.out.println("Current time is: " + time);
	}

	// display time and power
	public void displayTimePower() {
		System.out.println("Current time is: " + time);
		System.out.println("Current power is: " + power);
	}

	// timeButton method
	public void timeButton() {
		time = time + 30;
	}

	// powerButton method (toggle)
	public void powerButton() {
		if (power == 1) {
			power = 2;
		} else {
			power = 1;
		}
	}

	// resetButton method
	public void resetButton() {
		time = 0;
		power = 1;
	}

	// startButton method
	public void startButton() {
		System.out.println("Cooking for " + time + " seconds at power level " + power + " of 2.");
	}

}
