package oopsConcepts;

class Address {
	String city;
	String state;
	int pincode;
	
	Address(String city,String state,int pincode){
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		
	}
		
}

class Employee {
	int id;
	String name;
	Address add;
	
	Employee(int id,String name,Address add){
		this.id = id;
		this.name = name;
		this.add = add;
		
	}
	
	void display(){
		System.out.println("ID :" + id + "\nName :" + name); 
		System.out.println("Address : " + add.city + " " + add.state + " " + add.pincode);
	}
	
}


public class AggregationHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add1 = new Address("Pnp", "HR06", 132103);
		Address add2 = new Address("fbd", "HR51", 121001);
		
		Employee emp1 = new Employee(101, "Sunil", add1);
		Employee emp2 = new Employee(102, "Juneja", add2);
		
		emp1.display();
		
		emp2.display();
		

	}

}
