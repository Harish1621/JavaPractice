
public class Vechile {
	String model;
	String name;
	int msrp;
	int wheelSize;
	
	public Vechile(String a, String b, int c, int d) {
		model = a;
		name = b;
		msrp = c;
		wheelSize = d;
	}
	
	public static void main(String[] args) {
		
		Vechile raj = new Vechile("SUV", "CR-V", 35000, 17);
		Vechile harish = new Vechile("Sedan", "Benz C-class", 43000, 19);
		Vechile manoj = new Vechile("SUV", "CX-300", 33000, 18);
		Vechile koka = new Vechile("Coupe", "Mustang", 25000, 20);
		
		raj.buy(raj.msrp, raj.name);
		harish.buy(harish.msrp, harish.name);
		manoj.buy(manoj.msrp, manoj.name);
		koka.buy(koka.msrp, koka.name);
		
	}
	
	public void buy(int msrp, String name) {
		if (msrp >= 40000) {
			System.out.println(name);
		}
	}

}
