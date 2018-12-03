package module.one.java;

public class ConditionalStatements {

	public static void main(String[] args) {
		checkVotingAge(17);
		checkNumber(0);
		checkNumberTwo(-10);
		findLargest(2, 5);
		checkNumberThree(7);
	}
	
	public static void checkVotingAge(int candidateAge) {
		if(candidateAge >= 18) {
			System.out.println("You are eligable to vote.");
		}
		else {
			System.out.println("You are not eligable to vote.");
		}
	}
	
	public static void checkNumber(int number) {
		if(number > 0) {
			System.out.println("The number is positive.");
		}
		else {
			System.out.println("The number is negative");
		}
	}
	
	public static void checkNumberTwo(int number) {
		if(number > 0) {
			System.out.println("The number is positive.");
		}
		else if(number == 0) {
			System.out.println("The number is zero.");
		}
		else {
			System.out.println("The number is negative");
		}
	}
	
	public static void findLargest(int num1, int num2) {
		int largest = Math.max(num1, num2);
		System.out.println("The largest number is " + largest);
	}

	public static void checkNumberThree(int number) {
		if(number % 2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
	}
	
}
