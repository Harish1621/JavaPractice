package Fruitbusiness;

public class Fruitbusiness {
	public void costly(String fruitName, int price) {
		if(price > 10) {
			System.out.println("Costly fruit " + fruitName);
		}
		
	}
	public void cheap(String fruitName, int price) {
		if(price < 5) {
			System.out.println("Cheap fruit " + fruitName);
		}
		
	}
}
