package ExampleArray;

import java.util.Scanner;

public class Rajexample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col ;
		System.out.print("Please enter a integer value for variable: row ");
		row = scan.nextInt();
		System.out.print("Please enter a integer value for variable: col ");
		col = scan.nextInt();
		int [][] myArrayOne = new int [row][col];
		int [][] myArrayTwo = new int [row][col];
		int [][] sum = new int [row][col];
		System.out.print("Please enter the first matrix value in intergers only based on size " + row*col + " :");
		for(int i =0;i <myArrayOne.length;i++) {
				for(int j=0; j<myArrayOne[0].length;j++) {
					myArrayOne[i][j] = scan.nextInt();
					/* System.out.println(myArrayOne[i][j]); */
				}
			}
		
		for(int i =0;i <myArrayOne.length;i++) {
			for(int j=0; j<myArrayOne[0].length;j++) {
				/* myArrayOne[i][j] = scan.nextInt(); */
				System.out.print(myArrayOne[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.print("Please enter the second matrix value in intergers only based on size " + row*col + " :");
		for(int i =0;i <myArrayTwo.length;i++) {
			for(int j=0; j<myArrayTwo[0].length;j++) {
				myArrayTwo[i][j] = scan.nextInt();
				/* System.out.println(myArrayOne[i][j]); */
			}
		}
		for(int i =0;i <myArrayTwo.length;i++) {
			for(int j=0; j<myArrayTwo[0].length;j++) {
				/* myArrayOne[i][j] = scan.nextInt(); */
				System.out.print(myArrayTwo[i][j]+ " ");
			}
			System.out.println();
		}
		
		if(myArrayOne.length == myArrayTwo.length && myArrayOne[0].length == myArrayTwo[0].length) {
			for(int i =0; i<myArrayOne.length; i++) {
				for(int j =0; j<myArrayOne[0].length;j++) {
					sum[i][j] = myArrayOne[i][j] + myArrayTwo[i][j];
				}
			}

		}
		for(int i =0; i<myArrayOne.length; i++) {
			for(int j =0; j<myArrayOne[0].length;j++) {
				System.out.print(sum[i][j]+ " ");
			}
		}
				
	}
}



