package module.one.java;

import java.util.Scanner;

public class CaseStudyTwo {

	public static void main(String[] args) {
		System.out.println("How many tickets are needed?");
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		System.out.println("What category will be tickets?");
		String category = in.nextLine();

		int sum;
		int silverCategoryPrice = 150;
		int goldenCategoryPrice = 200;
		
		if(category.equals("silver")) {
			sum = amount * silverCategoryPrice;
			System.out.println("The price for the silver tickets is: " + sum);
		}
		else if(category.equals("golden")) {
			sum = amount * goldenCategoryPrice;
			System.out.println("The price for the golen tickets is: " + sum);
		}
	}
}