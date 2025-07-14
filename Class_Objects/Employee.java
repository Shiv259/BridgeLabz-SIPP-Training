public class Employee {
    int id;
	String name;
	int salary;
	public void display() {
		System.out.println(id + " " + name + " " + salary);
	}
    public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 101;
		emp.name = "Shivam";
		emp.salary = 10000;
		emp.display();
		
	}
}


