package Fruitbusiness;

public class FruitBusinessDemo {
	
	public static void main(String[] args) {
		Fruit f = new Fruit(4, "apple", "red");
		Fruit r = new Fruit(6, "orange", "orange");
		Fruit u = new Fruit(11, "kiwi", "brown");
		
		Fruitbusiness fb = new Fruitbusiness();
		
		fb.costly(f.name, f.price);
		fb.costly(r.name, r.price);
		fb.costly(u.name, u.price);
				
		fb.cheap(f.name, f.price);
		fb.cheap(r.name, r.price);
		fb.cheap(u.name, u.price);
			
	}
	
}
