package module.one.java;

import java.util.Scanner;

public class CaseStudyOne {

	public static void main(String[] args) {
		System.out.println("How many tickets are needed?");
		Scanner in = new Scanner(System.in);
		int ticketPrice = 400;
		int disc = (int) 0.1;
		int ticketsSold = in.nextInt();
		int sum;
		
		if(ticketsSold >= 10) {
			sum = ticketPrice - (ticketsSold * disc);
			System.out.println("The discounted sum is: " + sum);
		}
		else {
			sum = ticketsSold * ticketPrice;
			System.out.println("The sum is: " + sum);
		}
	}
}