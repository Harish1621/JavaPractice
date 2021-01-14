
public class Fruit {
	int price;
	String name;
	String color;
	
	public Fruit(int p, String n, String c) {
		price = p;
		name = n;
		color = c;
	}
	public static void main(String[] args) {
		Fruit f = new Fruit(10, "mango", "yellow");
		Fruit r = new Fruit(9, "orange", "orange");
		Fruit u = new Fruit(11, "kiwi", "brown");
		Fruit i = new Fruit(6, "banana", "yellow");
		Fruit t = new Fruit(8, "apple", "red");
		
		f.costlyFruit(f.price);
		r.costlyFruit(r.price);
		u.costlyFruit(u.price);
		i.costlyFruit(i.price);
		t.costlyFruit(t.price);
	}
	
	public void costlyFruit(int price) {
		if(price >= 10) {
			System.out.println(name);
		}
	}
}