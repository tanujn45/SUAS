class Employee {

	// Declaring variables
	private int emp_id;
	private String fname;
	private double salary;
	private String dept;

	// Getter and Setter methods
	void setValues(int emp_id, String fname, double salary,	String dept) {
		this.emp_id = emp_id;
		this.fname = fname;
		this.salary = salary;
		this.dept = dept;
	}

	void getValues() {
		System.out.println("Details of the Employee with id " + this.emp_id);
		System.out.println("Name - " + this.fname);
		System.out.println("Salary - Rs " + this.salary);
		System.out.println("Department - " + this.dept + "\n");
	}

}

public class App {
	public static void main(String[] S) {

		// Declaring objects of type Employee
		Employee A = new Employee();
		Employee B = new Employee();
		Employee C = new Employee();

		// Passing Employee information
		A.setValues(1, "Elon Musk", 100000000, "Space Technologies");
		B.setValues(2, "Warren Buffet", 500000000, "Finance and Investment");
		C.setValues(3, "Steve Jobs", 1000000, "Mobile Technologies");

		// Getting Employee information
		A.getValues();
		B.getValues();
		C.getValues();
	}
}