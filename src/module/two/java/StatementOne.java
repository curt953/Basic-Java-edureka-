package module.two.java;

import java.util.Scanner;

public class StatementOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] employeesIds = new int[5];
		String[] employeesNames = new String[5];
		int[] employeesSalaries = new int[5];
		int i = 0;
		
		while(i <= 5) {	
			System.out.println("Please enter the employee ID: ");
			employeesIds[i] = in.nextInt();

			System.out.println("Please enter the employee name: ");
			employeesNames[i] = in.next();
			
			System.out.println("Please enter the employee salary: ");
			employeesSalaries[i] = in.nextInt();
			
			i++;
			
			if(i == 5) {
				break;
			}
		}
		display(employeesIds, 0);
	}
	
	static void display(int[] element, int i) {
		System.out.printf("%d%n",  element[i]);
		i++;
	}
	
	static void displayStr(String[] element, int i) {
		System.out.printf("%s%n", element[i]);
		i++;
	}
}