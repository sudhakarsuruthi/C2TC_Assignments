package Assignment5;

public class TickectBooking {
    // Private attributes
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TickectBooking() {}

    // Parameterized constructor
    public TickectBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Display booking details
    public void display() {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
    }

    // Overloaded methods for payment

    // 1️⃣ Payment using Cash
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // 2️⃣ Payment using Wallet
    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // 3️⃣ Payment using Credit Card
    public void makePayment(String holderName, double amount, String creditCardType, String ccv) {
        System.out.println("Holder name:" + holderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
        System.out.println("CCV:" + ccv);
    }
}