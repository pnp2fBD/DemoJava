package oopsConcepts;

class Parent2 {
	public static void print() {
		System.out.println("I am Parent");
	}
}

class Child2 extends Parent {
	public void print() {
		System.out.println("I am Child");
	}

public class StaticMethodOverride2 {

		public static void main(String args[]) {
			Parent parent = new Child();
			parent.print();
		}

}
