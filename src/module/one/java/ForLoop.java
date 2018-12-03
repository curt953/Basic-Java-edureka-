package module.one.java;

public class ForLoop {

	public static void main(String[] args) {
		printOddAndEven(20);
		findFactoriel(5);
		printTablesOfTen(3);
		addDigitsOfNum(122);
		reverseDigits(123);
		fibonacciNumbers(10);
	}
	
	public static void printOddAndEven(int number) {
		for(int i = 0; i <= number; i++) {
			if(i % 2 == 0) {
				System.out.println("Even number: " + i);
			}
			else {
				System.out.println("Odd number: " + i);
			}
		}
	}
	
	public static void findFactoriel(int number) {
		int fakt  = 1;
		
		for(int i = 2; i <= number; i++) {
			fakt = fakt * i;
			System.out.println("Faktoriel is: " + fakt);
		}
	}

	public static void printTablesOfTen(int number) {	
		if(number > 0) {
			for(int i = 1; i <= 10; i++) {
				int mult = number * i;
				System.out.printf("Table [%d]: %d%n", i, mult);
			}
		}
	}

	public static void addDigitsOfNum(int number) {
		int sum = 0;
		for(int i = 1; i < number; i++) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("Added digits of the sum is: " + sum);
	}
	
	public static void reverseDigits(int number) {
		int reverse = 0;
		
		for(int i = 0; i < number; i++) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("The reversal of the digits is: " + reverse);
	}
	
	public static void fibonacciNumbers(int number) {
		int prev = 0;
		int next = 1;
		int tmp = 0;
		int fib = 0;
		
		for(int i = 0; i < number - 1; i++) {
			fib = prev + next;
			prev = next;
			next = fib;
			tmp += 1;
			System.out.printf("The fibinaci sequence %d%n", fib);
		}
	}
}