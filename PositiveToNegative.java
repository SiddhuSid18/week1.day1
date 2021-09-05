package Week1.day1.Assignment2;

public class PositiveORNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int positiveValue;
		if(number < 0) {
			System.out.println("The given number " + number + " is a Negative number");
			positiveValue = -number;
			System.out.println("The Number " + number + " is Converted into " + positiveValue);
		}
		else if(number > 0) {
			System.out.println("The given number " + number + " is a Positive number");
		}
		else {
			System.out.println("The given number " + number + " is Neither a Positive nor a Negative number");
		}
	}

}
