package oopTask3;

public class Main {
	public static void main (String[] args) {
		Veterinarian med = new Veterinarian();
		med.setName("Mark");
		
		Animal cat2 = new Cat("Fish", "Black", 4, "Muha");
		
		System.out.println(cat2 + "\n" + cat2.getVoice());
		cat2.eat();
		cat2.sleep();
		System.out.println(med);
		med.treatmentCat(cat2);
		
		System.out.println("");
		
		Animal dog = new Dog ("Meet", "Black and White", 16, "Bobik");
		
		System.out.println(dog + "\n" + dog.getVoice());
		dog.eat();
		dog.sleep();
		System.out.println(med);
		med.treatmentCat(dog);
		
		
	}
}
