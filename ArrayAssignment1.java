
public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numbers = { 25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146 };
		for (double number : numbers) {
			System.out.print(number + " ");
		}
		
		System.out.println(" ");
		
		double max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			// Compare elements of array with max
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println("Largest element present in given array: " + max);
		System.out.println(" ");

		int i;
		int positiveCount = 0, negativeCount = 0;
		for(i = 0; i < 10; i++)
		{
			if(numbers[i] >= 0)
			{
				positiveCount++;
			}
			else
			{
				negativeCount++;
			}
		}		
		System.out.println("\n Total Number of Positive Numbers in this Array = " + positiveCount);
		System.out.println("\n Total Number of Negative Numbers in this Array = " + negativeCount);
	
	
	
	
	
	}		
}
