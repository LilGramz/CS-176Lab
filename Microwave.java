
public class Microwave {
	// increase time by 30 seconds
	// switch between power 1 and 2
	// reset button
	// start button

	int time = 0;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time + 30;
	}

	int power = 1;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
