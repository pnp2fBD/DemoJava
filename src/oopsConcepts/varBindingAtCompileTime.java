package oopsConcepts;

class Parent3 {
	int x = 10;

	public Parent getObject() {
		return new Parent();
	}
}

class Child3 extends Parent3 {
	int x = 20;

	public Child getObject() {
		return new Child();
	}
}

public class varBindingAtCompileTime {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		System.out.println(p.getObject().x);
	}

}
