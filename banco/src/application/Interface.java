package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Interface {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char resp = sc.next().charAt(0);
		
		if(resp == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialBalance= sc.nextDouble();
			conta = new Conta(numberAccount, name, initialBalance);
		}
		
		else {
			conta = new Conta(numberAccount, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double balance= sc.nextDouble();
		conta.addbalance(balance);
		
		System.out.println("update account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		balance= sc.nextDouble();
		conta.retbalance(balance);
		
		System.out.println("update account data:");
		System.out.println(conta);
		
		
		sc.close();
	}

}