package assignment2;

public class Assignment2 {
    public static void main(String[] args) {
        // Step 1: Just create a Student object → constructor prints message
        new Student();

        // Step 2: Create Commission object
        Commission emp = new Commission();

        // Step 3: Accept employee details
        emp.acceptDetails();

        // Step 4: Calculate and display commission
        emp.calculateCommission();
    }
}



