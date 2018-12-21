package oopsConcepts;

class Dog extends Animal {
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.bark();
		c.meow();
		c.eat();
		

	}

}
