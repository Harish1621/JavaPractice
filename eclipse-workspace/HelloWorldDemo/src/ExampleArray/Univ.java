package ExampleArray;


public class Univ {
	public static void main(String[] args) {
		String [] a = {"Les", "Daisy", "Sam", "Mastercat", "Fudeg", "Luci", "Harry", "Bas", "Esmerelda", "Blonkie", "King", "Bird", "Audrey", "Fay"};
		a[13] = "Lydia";
		for(int i = 0;i< a.length; i++) {
			System.out.println(a[i]);
		}
		for(String animal:a) {
			System.out.println(animal);
		}
		int[] numbers = new int[20];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = (3*i)+1;
			/* System.out.println(numbers[i]); */
		}
		for(int num:numbers) {
			System.out.print(num + " ");
		}
		
	}
}
