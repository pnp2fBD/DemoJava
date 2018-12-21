package Oops2;

public class MainClass2 {
	 
	 public static void main(String[] args) {
	  Parent p = new Child();
	  p.print();
	 }
	}
	 
	class Parent {
	 int x = 10;
	 
	 public void print() {
	  System.out.println("Parent " + x);
	 }
	} 
	 
	class Child extends Parent {
	 public Child() {
	  x = 30;
	 }
	}