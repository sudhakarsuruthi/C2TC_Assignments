package assignments;

import employee.Manager;
import employee.Developer;
import utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
        // Create objects
        Manager m1 = new Manager("Shiva", 101, 75000, "Sales");
        Developer d1 = new Developer("Vishnu", 102, 60000, "Java");

        // Utilities object
        EmployeeUtilities util = new EmployeeUtilities();

        // Print details
        util.printEmployeeDetails(m1);
        util.printEmployeeDetails(d1);

        // Give salary raise
        util.giveRaise(m1, 10);
        util.giveRaise(d1, 15);
    }
}

