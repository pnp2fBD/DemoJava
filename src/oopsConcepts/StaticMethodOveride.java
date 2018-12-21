package oopsConcepts;

class Parent {
	public static void print() {
		System.out.println("I am Parent");
	}
}

class Child extends Parent {
	public static void print() {
		System.out.println("I am Child");
	}
}

public class StaticMethodOveride {
	public static void main(String args[]) {
		Parent p1 = new Parent();
		p1.print();

		Parent c2 = new Child();
		c2.print();

		Child child = new Child();
		child.print();
	}
}

//Static methods are not polymorphic and doesn't take part in run time or dynamic polymorphism 
//and the decision as to which method will be called is resolved at compile time based on the type alone.

//If a derived class defines a static method with same signature as a static method in base class, 
// the method in the derived class hides the method in the base class.