package employee;

public class Employee {
	 private String name;
	    private int employeeId;
	    private double salary;

	    // Constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    protected void setName(String name) {  // protected example
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    protected void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {  // public for allowing updates
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee [Name=" + name + ", ID=" + employeeId + ", Salary=" + salary + "]";
	    }

}
