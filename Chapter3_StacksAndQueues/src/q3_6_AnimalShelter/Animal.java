package q3_6_AnimalShelter;

/**
 * model for animal, cat and dog
 * @author Zach
 *
 */
public abstract class Animal {
	private int order;
	private String name;
	
	
	public Animal(String name) {
		this.name = name;
	}

	public boolean isOlderThan(Animal a){
		return this.order < a.order;
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
}

class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
}
