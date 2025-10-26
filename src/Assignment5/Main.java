package Assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read booking details
        String input = sc.nextLine();
        String[] details = input.split(",");
        TickectBooking booking = new TickectBooking(details[0], details[1], Integer.parseInt(details[2]));

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        booking.display();

        switch (choice) {
            case 1:
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2:
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3:
                String holderName = sc.nextLine();
                double creditAmount = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, creditAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}