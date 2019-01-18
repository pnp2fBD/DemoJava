package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListConcept {

	public static <E> void main(String args[]) {
		
		//static array - size is fixed	
		 int a[] = new int[3]; 
		 
		 //dynamic array - ArrayList
		 // if we add the values array size will automatically increase
		 // it can contains the duplicate value
		 // it maintains the insertion order
		 // it is not synchronized - 
		 // it allows random access to fetch the element bcoz it stores the values on basis of indexes
		 
		 ArrayList aL = new ArrayList();		 
		 
		 aL.add(10);
		 aL.add(20);
		 aL.add(30);
		 
		 System.out.println("Array length is : " + aL.size());
		 		 
		 aL.add(40);
		 aL.add(50);
		 
		 System.out.println("Array length is : " + aL.size());
		 
		 aL.add(10);
		 aL.add(12.33);
		 aL.add("Test");
		 aL.add(true);
		 
		 System.out.println("Array length is : " + aL.size());
		 
		 System.out.println("element at 3 is : " + aL.get(3)); // to get the value from index
		 
		 // to get the all values from array list use the For loop
		 
		 for(int i=0; i < aL.size(); i++){
			 System.out.println(" values are : " + aL.get(i));
		 }
		 
		 //non-generic vs generic
		 // this is non genric arrayList as type is not defined
		 // define generic
		 
		 ArrayList<Integer> ar2 = new ArrayList<Integer>();
		 ar2.add(100);
		 ar2.add(200);
		 // this is called generic framework .It comes after JDK 1.4
		 // Java generic allows you to define type after jdk 1.4
		 
		 ArrayList<String> ar3 = new ArrayList<String>();
		 ar3.add("Test");
		 ar3.add("selenium");
		 
		 
		 ArrayList<E> ar4 = new ArrayList<E>();
		 // when you dont know the type of generic
		 
		 //Employee class object		 
		 Employee e1 = new Employee("Sunil", 35, "QA");
		 Employee e2 = new Employee("Tom", 25, "Dev");
		 Employee e3 = new Employee("Bharat", 29, "Admin");
		 
		 // Create ArrayList of employee object
		 ArrayList<Employee> alEmp = new ArrayList<Employee>();
		 alEmp.add(e1);
		 alEmp.add(e2);
		 alEmp.add(e3);	 
		 
		 //iterator to traverse the values
		 Iterator<Employee> itr = alEmp.iterator();		 
		 while(itr.hasNext()){
			 Employee emp = itr.next();
			 System.out.println("Employee Arraylist " + "Name " + emp.name + " Age " + emp.age + " Dept " + emp.dept);
		 }
		 
		 /**************/
		 //addAll()
		 
		 ArrayList<E> ar10 = new ArrayList<E>();
		 // when you dont know the type of generic
		 
		 //Employee class object		 
		 Employee e5 = new Employee("Juneja", 35, "QA");
		 Employee e6 = new Employee("Raid", 25, "Dev");
		 Employee e7 = new Employee("Grover", 29, "Admin");
		 
		 // Create ArrayList of employee object
		 ArrayList<Employee> alEmp2 = new ArrayList<Employee>();
		 alEmp2.add(e5);
		 alEmp2.add(e6);
		 alEmp2.add(e7);	 
		 
		 alEmp.addAll(alEmp2);
		 System.out.println("after add all");
		 
		 Iterator<Employee> itr2 = alEmp.iterator();		 
		 while(itr2.hasNext()){
			 Employee emp = itr2.next();
			 System.out.println("Employee Arraylist " + "Name " + emp.name + " Age " + emp.age + " Dept " + emp.dept);
		 }
		 
		 
		 /**************/
		 //removeAll()
		 alEmp.removeAll(alEmp2);
		 
		 System.out.println("after remove all");
		 
		 Iterator<Employee> itr3 = alEmp.iterator();		 
		 while(itr3.hasNext()){
			 Employee emp = itr3.next();
			 System.out.println("Employee Arraylist " + "Name " + emp.name + " Age " + emp.age + " Dept " + emp.dept);
		 }
		 
		 /**************/
		 //retainAll()
		 
		 ArrayList<Employee> alEmp3 = new ArrayList<Employee>();
		 Employee e11 = new Employee("Sunil", 35, "QA");
		 alEmp3.add(e11);	
		 
		 
		 alEmp.retainAll(alEmp3);
		 
		 System.out.println("after retain all");
		 
		 Iterator<Employee> itr4 = alEmp.iterator();		 
		 while(itr4.hasNext()){
			 Employee emp = itr4.next();
			 System.out.println("Employee Arraylist " + "Name " + emp.name + " Age " + emp.age + " Dept " + emp.dept);
		 }
		 
	}

}
