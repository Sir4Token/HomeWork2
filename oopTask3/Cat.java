package oopTask3;

public class Cat extends Animal {
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVoice(){
		String voice = "may-may-may";
		return voice;
	}
	
	public void Eat () {
		System.out.println("The cat is eating");
		
	}
	
	public void sleep(){
		System.out.println("The cat is sleeping");
		
	}

	@Override
	public String toString() {
		return "Cat [name = " + name + ", Characteristic = " + super.toString() + "]";
		}

	
}
