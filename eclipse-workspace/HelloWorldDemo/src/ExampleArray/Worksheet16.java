package ExampleArray;

import java.io.*;
import java.util.*;

public class Worksheet16 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner myFileReader = new Scanner(new File("arrayData.txt"));
		int[] numArray = new int[11];
		String[] mammalArray = new String[16];
		int index = 0;
		while (myFileReader.hasNextInt()) {
			numArray[index] = myFileReader.nextInt();
			index++;
		}
		/*
		 * for(int i =0;i<numArray.length;i++) { System.out.println(numArray[i]); }
		 */
		for (int i = numArray.length - 1; i >= 0; i--) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] < 0) {
				System.out.println(numArray[i]);
			}
		}
		for (int i = 0; i < numArray.length; i = i + 2) {
			System.out.println(numArray[i]);
		}
		int in = 0;
		while (myFileReader.hasNext()) {
			mammalArray[in] = myFileReader.next();
			in++;
		}
		for (int i = 0; i < mammalArray.length; i++) {
			System.out.println(mammalArray[i]);
		}
		for (int i = 0; i < mammalArray.length; i++) {
			if (mammalArray[i].charAt(0) >= 'H' && mammalArray[i].charAt(0) <= 'Z') {
				System.out.println(mammalArray[i]);
			}
		}
	}

}
