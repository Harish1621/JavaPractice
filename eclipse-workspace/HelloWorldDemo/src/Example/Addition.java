package Example;

public class Addition {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		Addition a = new Addition();
		a.Add(n);
	}
	
	public void Add(int n) {
		for(int i = 1; i<=n; i++) {
			int sum = 0;
			
			/*
			 * System.out.print(i); System.out.println();
			 */
			for(int j =1; j<=i;j++) {
				/* System.out.println("+"); */

				/* System.out.print(j + " "); */
			
				/* System.out.println(i + "+" + ++i); */
				sum = sum + j;
		}
			System.out.println(sum);
	}
		
}
}