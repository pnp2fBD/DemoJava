package oopsConcepts;

class Animal {
	void eat() {
		System.out.println("Animal is Eating..");
	}
}

class Cat extends Animal
{
	//void eat() {
	//	System.out.println("Cat..is.. Eating..");
	//}
	
	void sound(){
		System.out.println("Cat sound is ..Meow.. Meow ..");
	}
	
	void meow(){
		System.out.println("Cat is speaking ....");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c = new Cat();
		c.eat();
		c.sound();

	}

}
