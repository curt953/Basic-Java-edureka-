package module.one.java;

public class DoWhile {
	public static void main(String[] args) {
		printOddAndEven(20);
		findFactoriel(5);
		printTablesOfTen(3);
		addDigitsOfNum(122);
		reverseDigits(123);
		fibonacciNumbers(10);
	}
	
	public static void printOddAndEven(int number) {
		int tmp = 0;
		
		do {	
			if(tmp % 2 == 0) {
				System.out.println("Even number: " + tmp);
			}
			else {
				System.out.println("Odd number: " + tmp);
			}
			
			tmp += 1;
		}
		while(tmp <= number);
	}
	
	public static void findFactoriel(int number) {
		int tmp = 2;
		int fakt = 1;
		
		do {
			fakt = fakt * tmp;
			tmp += 1;
			System.out.println("Faktoriel is: " + fakt);
		} while(tmp <= number);
	}
	
	public static void printTablesOfTen(int number) {
		int tmp = 0;
		
		do {
			if(number > 0) {
				int mult = number * tmp;
				System.out.printf("Table [%d]: %d%n", tmp, mult);
				tmp += 1;
			}
		} while(tmp <= 10);
	}
	
	public static void addDigitsOfNum(int number) {
		int tmp = 1;
		int sum = 0;
		
		do {
			sum = sum + number % 10;
			number = number / 10;
			tmp += 1; 
		} while(tmp < number);
		System.out.println("Added digits of the sum is: " + sum);
	}
	
	public static void reverseDigits(int number) {
		int tmp = 0;
		int reverse = 0;
		
		do {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
			tmp += 1;
		} while(tmp <= number);
		System.out.println("The reversal of the digits is: " + reverse);
	}
	
	public static void fibonacciNumbers(int number) {
		int tmp = 0;
		int prev = 0;
		int next = 1;
		int fib = 0;
		
		do {
			fib = prev + next;
			prev = next;
			next = fib;
			tmp += 1;
			System.out.printf("The fibinaci sequence %d%n", fib);
			tmp += 1;
		} while(tmp < number - 1);
	}
}