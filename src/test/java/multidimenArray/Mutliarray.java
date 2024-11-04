package multidimenArray;

import java.util.Scanner;

public class Mutliarray {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Row");
		int row = sc.nextInt();
		System.out.println("Enter a column");
		int column = sc.nextInt();
	
		int arr[][] = new int[row][column];
		System.out.println("Enter value of 2D array");
		for(int i = 0; i <row;i++) {
			for(int j = 0;j <column;j++) {
				 arr[i][j] = sc.nextInt();
			}
		}	
		System.out.println("Showing all value of 2D array");
		for(int i = 0; i <row;i++) {
			for(int j = 0;j <column;j++) {	
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
			}
	}
}
