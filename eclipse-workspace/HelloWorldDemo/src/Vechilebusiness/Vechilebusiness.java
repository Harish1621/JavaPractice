package Vechilebusiness;

public class Vechilebusiness {
	public void costly (String name, int price) {
		if(price > 50000) {
			System.out.println("Costly " + name);
		}
	}
	public void cheap(String name, int price) {
		if(price < 30000) {
			System.out.println("Cheap " + name);
		}
	}
}
