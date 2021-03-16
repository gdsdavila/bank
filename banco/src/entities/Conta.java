package entities;

public class Conta {
	private int numberAccount;
	private String name;
	private double balance;
	
	public Conta() {
		
	}
	
	public Conta(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
		
	}
	
	public Conta(int numberAccount, String name, double initialBalance) {
		this.numberAccount = numberAccount;
		this.name = name;
		addbalance(initialBalance);
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void addbalance(double balance) {
		this.balance += balance;
	}
	
	public void retbalance(double balance) {
		 this.balance -= balance + 5;
	}
	
	public String toString() {
		return "Account "
				+numberAccount
				+", holder "
				+name
				+", balance: $"
				+ String.format("%.2f", balance);
		
	}
}