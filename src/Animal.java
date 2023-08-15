
public abstract class Animal {

	protected String name; // Toegankelijk voor de huidige classes en de subclasses --> inheritance
	
	protected int legs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void Properties() {
		System.out.println("Het aamtal benen is " + legs);
		System.out.println("De naam is " + name);
	}
	
	public abstract void makeSound();
	
	public abstract void Smell();
}
