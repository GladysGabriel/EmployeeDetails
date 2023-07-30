package org.emp;

public class Employee {

	private void empID() {
		System.out.println("1234");
	
}
	private void empName() {
		System.out.println("Gladys");
	}
	
	private void empDob() {
		System.out.println("01 Jan 2000");
	}
	private void empPhone() {
		System.out.println("1234567890");
	}
	private void empEmail() {
		System.out.println("abc@gmail.com");
	}
	private void empAddress() {
		System.out.println("xxx,yyy,ZZZ");
	}
	
	
	public static void main(String []args) {
		Employee e= new Employee ();
		e.empID();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
		
	}
	
	}
	
	
