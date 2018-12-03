package module.two.java;

public class MultiDimensionalArr {

	public static void main(String[] args) {
		addTwoDimensionalArr(new int[2][2]);
		//subtractTwoDimensionalArr(new int[2][2]);
	}
	
	static void addTwoDimensionalArr(int[][] elements) {
		int[] first = {1, 2, 3};
		int[] second = {5, 6, 7};
		int x;
		
		for(int i = 0; i <= elements.length; i++) {
			x = elements[0][i];
			System.out.printf("The added array is %d ", x);
		}
	}

	static void subtractTwoDimensionalArr(int[][] elements) {
		int[] first = new int[5];
		int[] second = new int[5];
								
		
	}
}