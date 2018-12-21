package oopsConcepts;
class Kitten extends Cat{
	
	void smile(){
		System.out.println("Kitten smile is ...Wow...");
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kitten k = new Kitten();
			k.eat();
			k.sound();
			k.smile();
		
	}

}
