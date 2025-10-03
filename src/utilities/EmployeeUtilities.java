package utilities;
import employee.Employee;

public class EmployeeUtilities {
	public void giveRaise(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary); // public method from Employee
        System.out.println(emp.getName() + " got a raise! New Salary: " + emp.getSalary());
    }

   
    public void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Details: " + emp);
    }

}
