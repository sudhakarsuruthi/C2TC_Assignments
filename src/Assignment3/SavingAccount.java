package Assignment3;

public class SavingAccount extends Account {
	 private double interestRate = 0.03; // 3% interest rate

	 public SavingAccount(String accountHolder, double initialBalance) {
	     super(accountHolder, initialBalance);
	 }

	 @Override
	 public void deposit(double amount) {
	     balance += amount + (amount * interestRate);
	     System.out.println("Deposited ₹" + amount + " with interest. New Balance: ₹" + balance);
	 }

	 @Override
	 public void withdraw(double amount) {
	     if (amount <= balance) {
	         balance -= amount;
	         System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
	     } else {
	         System.out.println("Insufficient balance for withdrawal!");
	     }
	 }

	 @Override
	 public double getBalance() {
	     return balance;
	 }
	}