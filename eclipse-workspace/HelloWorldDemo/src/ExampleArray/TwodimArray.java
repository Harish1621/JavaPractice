package ExampleArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwodimArray {
	public static void main(String[] args) throws FileNotFoundException {
		int[][] numArray2D = new int[4][3];
		Scanner scan = new Scanner(new File("2DArrayData.txt"));
		int i = 0; int j = 0; double sum = 0;
		double avg;
		while(scan.hasNextInt()) {
			/* numArray2D[i][j] = scan.nextInt(); */
				for(i =0; i<numArray2D.length;i++) {
					for(j=0;j<numArray2D[0].length;j++) {
			 numArray2D[i][j] = scan.nextInt(); 
			 	System.out.print(numArray2D[i][j]+ " "); 
			 	}
					System.out.println();
				/* System.out.println(numArray2D[i][j]); */
			}
		}
		for(int x =0; x<numArray2D.length;x++) {
			for(int y=0;y<numArray2D[0].length;y++) {
				System.out.println(numArray2D[x][y]);
			}
		}
		for(int x =0; x<numArray2D.length;x++) {
			for(int y=0;y<numArray2D[0].length;y++) {
				sum = sum + numArray2D[x][y];
			}
		}
		System.out.println(sum);
		avg = sum/(numArray2D.length*numArray2D[0].length);
		System.out.println(avg);
		for(int x =0; x<numArray2D.length;x++) {
			for(int y=0;y<numArray2D[0].length;y++) {
				if(numArray2D[x][y] > avg) {
					System.out.println(numArray2D[x][y]);
				}
			}
		}

	}
}