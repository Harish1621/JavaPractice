package Vechilebusiness;

public class VechileBusinessDemo {

	public static void main(String[] args) {
		Vechile v = new Vechile(30000, "mazda", "suv");
		Vechile e = new Vechile(40000, "bmw", "sedan");
		Vechile c = new Vechile(60000, "benz", "coupe");
		
		Vechilebusiness vb = new Vechilebusiness();
		
		vb.costly(v.name, v.price);
		vb.costly(e.name, e.price);
		vb.costly(c.name, c.price);
				
		vb.cheap(v.name, v.price);
		vb.cheap(e.name, e.price);
		vb.cheap(c.name, c.price);
		System.out.println(Long.MAX_VALUE);
	}
}
