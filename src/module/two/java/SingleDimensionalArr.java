package module.two.java;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArr {

	public static void main(String[] args) {
			findLargestElement(new int[]{120, 240, 360, 420});
			findElementInArray(new int[]{3, 5, 7, 9, 11});
			sortArrayInAsc(new int[] {2, 12, 33, 5, 7, 1});
			findTheLargestNum(new int[] {4, 16, 8, 9, 52, 77, 536, 420});
			reverseTheNumsInArr(new int[]{120, 240, 360, 420});
	}

	static void findLargestElement(int[] elements) {
		for(int i = 0; i <= elements.length; i++) {
			if(i == elements.length) {
				System.out.println("The largest element in the array is " + i);
			}
		}
	}
	
	static void findElementInArray(int[] elements) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int el = in.nextInt();
		
		for(int i = 0; i <= elements.length; i++) {
			if(el == elements[i]) {
				System.out.println("The element in the array is " + el);
			}
		}
	}
	
	static void sortArrayInAsc(int[] elements) {
		Arrays.sort(elements);
		System.out.println("The sorted array is " + Arrays.toString(elements));
	}
	
	static void findTheLargestNum(int[] elements) {
		for(int i = 0; i < elements.length; i++) {
			int x = elements[i];
			int y = elements[elements.length-1];
			
			if(x > y) {
				System.out.printf("%d", x);
			}
		}
	}
	
	static void reverseTheNumsInArr(int[] elements) {
		int tmp;
		
		for(int i = 0; i < elements.length / 2; i++) {
			tmp = elements[i];
			elements[i] = elements[elements.length - i - 1];
			elements[elements.length - i - 1] = tmp;
			System.out.println("The reversed array is " + tmp);
		}
	}
}