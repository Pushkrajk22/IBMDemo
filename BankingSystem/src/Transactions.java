
public interface Transactions {
	boolean depositMoney(double amount);
	boolean withdrawMoney(double amount);
	boolean transferFunds(double amount);
	double checkBalance(double accountNumber);
	
}
