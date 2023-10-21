package oopTask3;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVoice () {
		String voice = "Gav-Gav-Gav";
		return voice;
	}
	
	public void eat () {
		System.out.println("The dog is eating");
		
	}
	
	public void sleep () {
		System.out.println("The dog is sleeping");
		
	}

	@Override
	public String toString() {
		return "Dog [name = " + name + ", Characteristic = " + super.toString() + "]";
	}

	
	


	
	
	
}
