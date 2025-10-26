package Assignment3;

public final class Transaction {
	 // Final variable - constant transaction fee
	 private final double transactionFee = 10.0;

	 // Final method - cannot be overridden
	 public final void performTransaction(Account account, double amount, String type) {
	     System.out.println("\n--- Performing Transaction ---");
	     if (type.equalsIgnoreCase("deposit")) {
	         account.deposit(amount);
	     } else if (type.equalsIgnoreCase("withdraw")) {
	         account.withdraw(amount);
	     } else {
	         System.out.println("Invalid transaction type!");
	     }

	     System.out.println("Transaction Fee: ₹" + transactionFee);
	     System.out.println("Balance after transaction: ₹" + account.getBalance());
	     System.out.println("------------------------------\n");
	 }
	}