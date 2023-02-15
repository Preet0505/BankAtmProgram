package com.bankproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int CustomerNumber;
	private int PinNumber;
	private double CheckingBalance = 0;
	private double SavingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
	
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public int setCustomerNumber(int customerNumber) {
		this.CustomerNumber = customerNumber;
		return customerNumber;
	}
	public int getPinNumber() {
		return PinNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.PinNumber = pinNumber;
		return pinNumber;
	}
	
	
	public double getCheckingBalance() {
		return CheckingBalance;
	}
	
	public double getSavingBalance() {
		return SavingBalance;
	}
	
	

	public double calcCheckingWithdraw(double amount) {
		CheckingBalance = (CheckingBalance - amount);
		return CheckingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		SavingBalance = (SavingBalance - amount);
		return SavingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		CheckingBalance=(CheckingBalance + amount);
		return CheckingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		SavingBalance = (SavingBalance + amount);
		return SavingBalance; 
	}
	
	

	
	public void getCheckingWithdrawInput() {
		System.out.println(" checking account balance: " +moneyFormat.format(getCheckingBalance()));
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = input.nextDouble();
		
		if ((CheckingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking amount balance: " + moneyFormat.format(getCheckingBalance()));
		} else { 
			System.out.println("Balance cannot be negative:" + "\n ");
		}
	}
 
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(SavingBalance));
		System.out.println("Amount you want to withdraw from saving amount: ");
		double amount = input.nextDouble();
		
		if((SavingBalance - amount) <= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(SavingBalance));
		}else {
			System.out.println("Balance Cannot be Negative: " + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("checking Account Balance: " + moneyFormat.format(CheckingBalance));
		System.out.println("Amount you want to Deposit from Checking amount: ");
		double amount = input.nextDouble();
		
		if((CheckingBalance - amount) <= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(CheckingBalance));
		}else {
			System.out.println("Balance Cannot be Negative: " + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(SavingBalance));
		System.out.println("Amount you want to withdraw from saving amount: ");
		double amount = input.nextDouble();
		
		if((SavingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(SavingBalance));
		}else {
			System.out.println("Balance Cannot be Negative: " + "\n");
		}
	}
}
