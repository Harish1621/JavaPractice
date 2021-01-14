package ExampleArray;
import java.util.*;
import java.io.*;

public class ArrayListStuff
{
	public static void main(String[] args) throws Exception
	{
		Scanner myScanner = new Scanner(new File("arrayData.txt"));
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		int numIn;
		
		while((numIn = myScanner.nextInt()) != -1)
		{
			myNums.add(numIn);
			System.out.print(numIn + " ");
		}
		System.out.println();
		
		ArrayList<Dog> myDogs = new ArrayList<Dog>();
		while(myScanner.hasNext())
		{
			myDogs.add(new Dog(myScanner.next(), myScanner.nextInt()));
			System.out.println("size of myDogs = " + myDogs.size());
		}

		for(Dog myDog : myDogs)
		{
			System.out.println(myDog);
		}
		
		System.out.println(myDogs.get(2));
	}
}

