package assignment2;
import java.util.Scanner;

public class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails() {
        @SuppressWarnings("resource")  // remove "resource leak" warning
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine().trim();

        System.out.print("Enter Address: ");
        address = sc.nextLine().trim();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine().trim();

        System.out.print("Enter Sales Amount: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. Enter numeric Sales Amount: ");
            sc.next(); // skip bad input
        }
        salesAmount = sc.nextDouble();
    }

    public void calculateCommission() {
        double commission;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0.0;
        }

        System.out.println("\n--- Employee Commission Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}
