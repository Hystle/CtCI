package q3_6_AnimalShelter;

import java.util.LinkedList;
import java.util.List;

/**
 * build-in LinkedList API 
 * 1. poll(): retrieve and remove the top node
 * 2. peek(): retrieve but not remove the top node
 * @author Zach
 *
 */
public class AnimalShelter {
	List<Dog> dogs = new LinkedList<>();
	List<Cat> cats = new LinkedList<>();
	int order = 0;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		
		if(a instanceof Cat){
			cats.add((Cat) a);
		}
		else if(a instanceof Dog){
			dogs.add((Dog) a);
		}
	}
	
	public Cat dequeueCats(){
		return ((LinkedList<Cat>) cats).poll();
	}
	
	public Dog dequeueDogs(){
		return ((LinkedList<Dog>) dogs).poll();
	}
	
	public Animal dequeueAny(){
		if(dogs.isEmpty()){
			return dequeueCats();
		}
		else if(cats.isEmpty()){
			return dequeueDogs();
		}
		
		Dog dog = ((LinkedList<Dog>) dogs).peek();
		Cat cat = ((LinkedList<Cat>) cats).peek();
		
		if(dog.isOlderThan(cat)){
			return dequeueDogs();
		}
		else{
			return dequeueCats();
		}
	}
}
