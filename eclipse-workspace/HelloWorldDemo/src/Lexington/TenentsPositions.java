package Lexington;

public class TenentsPositions {
	
	/*
	 * public void jobType(String name, String position) { if(position == "FTE") {
	 * System.out.println("All FTE Tenents names: " + name); } else if (position ==
	 * "COC") { System.out.println("Only COC Tenents names: "+ name); } }
	 * 
	 * public void costlyTenent(String name, int salary) { if(salary > 180000) {
	 * System.out.println("Costly salary Tenents names: "+name); } }
	 * 
	 * public void avgTenent(String name, int salary) { if(salary < 180000) {
	 * System.out.println("Avg salary Tenents names: "+name); } }
	 */
	 
	public void exp(String name) {
		System.out.println("Tenet " + name );
	}
	
	public static void expPosition(String name, int exp, String position) {
		if(exp>5 && position.equals("SE")) {
			System.out.println(name + " years of exp "+ exp);
		}
	}
	

	
}

