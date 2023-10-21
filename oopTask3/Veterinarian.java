package oopTask3;

public class Veterinarian extends Animal {
	private String name;

	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	public Veterinarian() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void treatmentCat (Animal Cat) {
		System.out.println("Treatment methods for cats");
	}
	
	public void treatmentDog (Animal Dog) {
		System.out.println("Treatment methods for dogs");
	}

	@Override
	public String toString() {
		return "Veterinarian [name = " + name + "]";
	}
	
	

}
