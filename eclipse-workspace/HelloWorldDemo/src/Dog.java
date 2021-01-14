
public class Dog {
	String name;
	String breed;
	String color;
	
	public Dog(String n, String b, String c) {
		name =n;
		breed = b;
		color = c;
	}

	public static void main(String[] args) {
		
		Dog raj = new Dog("a", "b", "c");
		
		System.out.println(raj.name + "," + raj.breed + "," + raj.color );
		/*
		 * System.out.println(Pug.name + "," + Pug.breed + "," + Pug.color);
		 * System.out.println(Lab.name + "," + Lab.breed + "," + Lab.color);
		 */
		
		raj.bark(raj.name);
		/*
		 * Pug.bark(Pug.name); Lab.bark(Lab.name);
		 */
		
	}
	
	public void bark(String dogName) {
		
		Dog German = new Dog("Raj", "Ger", "Brown");
		Dog Pug = new Dog("Harish", "P", "Black");
		Dog Lab = new Dog("Vikram", "Labo", "White");
		System.out.println(German.name + "," + German.breed + "," + German.color );
		System.out.println(dogName + " is barking");
	}
}
