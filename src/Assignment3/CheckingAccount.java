package Assignment3;

public class CheckingAccount extends Account {

	 public CheckingAccount(String accountHolder, double initialBalance) {
	     super(accountHolder, initialBalance);
	 }

	 @Override
	 public void deposit(double amount) {
	     balance += amount;
	     System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
	 }

	 @Override
	 public void withdraw(double amount) {
	     if (amount <= balance) {
	         balance -= amount;
	         System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
	     } else {
	         System.out.println("Overdraft not allowed! Withdrawal denied.");
	     }
	 }

	 @Override
	 public double getBalance() {
	     return balance;
	 }
	}