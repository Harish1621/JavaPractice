package Example;

public class Armstrong {
	
	public static void main(String[] args) {
		Armstrong arm = new Armstrong();
		
		int n = 153;
		
		 if(n == arm.Test(n)) {
			  System.out.println("Given number is an Armstrong " + n); 
	     } else { 
	    	 System.out.println("Given number is not an Armstrong " + n); 
	    }
		 
	}
	public int Test(int n) {
		int a=0,z,b,temp;
		temp = n;
		while(temp > 0) {
		z =temp%10;
		temp = temp/10;
		a = a*10 + z;
		}
		
		return a;
	}
}
