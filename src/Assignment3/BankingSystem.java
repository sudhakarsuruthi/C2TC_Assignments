package Assignment3;

public class BankingSystem {
	 public static void main(String[] args) {
	     System.out.println("=== Banking Transaction System ===\n");

	     // Creating accounts
	     SavingAccount acc1 = new SavingAccount("Harini", 5000);
	     CheckingAccount acc2 = new CheckingAccount("Jerry", 8000);

	     // Performing transactions
	     Transaction txn = new Transaction();
	     txn.performTransaction(acc1, 2000, "deposit");
	     txn.performTransaction(acc2, 3000, "withdraw");

	     // Display account details
	     acc1.displayAccountInfo();
	     acc2.displayAccountInfo();

	     // Display total accounts created
	     System.out.println("\nTotal Bank Accounts Created: " + Bank.getTotalAccounts());
	 }
	}