package module.one.java;

public class WhileLoop {
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
		
		while(tmp <= number) {
			if(tmp % 2 == 0) {
				System.out.println("Even number: " + tmp);
			}
			else {
				System.out.println("Odd number: " + tmp);
			}
			
			tmp += 1;
		}
	}
	
	public static void findFactoriel(int number) {
		int tmp = 2;
		int fakt = 1;
		
		while(tmp <= number) {
			fakt = fakt * tmp;
			tmp += 1;
			System.out.println("Faktoriel is: " + fakt);
		}
	}

	public static void printTablesOfTen(int number) {	
		int tmp = 1;
		
		if(number > 0) {
			while(tmp <= 10) {
				int mult = number * tmp;
				System.out.printf("Table [%d]: %d%n", tmp, mult);
				tmp += 1;
			}
		}
	}

	public static void addDigitsOfNum(int number) {
		int tmp = 1;
		int sum = 0;
		
		while(tmp <= number) {
			sum = sum + number % 10;
			number = number / 10;
			tmp += 1;
		}
		System.out.println("Added digits of the sum is: " + sum);
	}
	
	public static void reverseDigits(int number) {
		int tmp = 0;
		int reverse = 0;
		
		while(tmp <= number) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
			tmp += 1;
		}
		System.out.println("The reversal of the digits is: " + reverse);
	}
	
	public static void fibonacciNumbers(int number) {
		int tmp = 0;
		int prev = 0;
		int next = 1;
		int fib = 0;
		
		while(tmp < number - 1) {
			fib = prev + next;
			prev = next;
			next = fib;
			tmp += 1;
			System.out.printf("The fibinaci sequence %d%n", fib);
			tmp += 1;
		}
	}
}