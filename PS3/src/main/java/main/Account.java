package main;

import java.util.Calendar;
import java.util.Date;

import CISC181.Week3.Package4.InsufficientFundsException;

	public class Account {
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private Date dateCreated;
		

	
		public Account (){
		
		}
		public Account (int id, double balance, Date dateCreated){
			this.id = id;
			balance *= 100;
			balance /= 100;
			this.dateCreated = dateCreated;
			this.balance = balance;
		}
		
		public int getId(){
			return id;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance( double balance){
			this.balance = balance;
		}
		public double getAnnualInterestRate(){
			return annualInterestRate;
		}
		public double setAnnualInterestRate(double annualInterestRate){
			return this.annualInterestRate = annualInterestRate;
		}
		
		public Date getDateCreated(){
			return dateCreated;
		}
		public double getMonthlyInterestRate(){
			double MonthlyInterestRate = getAnnualInterestRate() / 12;
			return MonthlyInterestRate;
		}
		public double withdraw(double amountOut) throws InsufficientFundsException{
			double newBalance = balance;
			if (balance >= amountOut){
				newBalance = balance - amountOut;
			}
			else{
				double neededFunds = amountOut - balance;
				throw new InsufficientFundsException(neededFunds);
				
			}
			newBalance *= 100;
			newBalance /= 100;
			return newBalance;
		}
		
		public double deposit(double amountIn){
			double newBalance = balance = amountIn;
			newBalance *= 100;
			newBalance /= 100;
			return newBalance;
			
		}
		
		public static Date getDateMade(){
			Calendar currentDateAndTime = Calendar.getInstance();
			Date currentDate = currentDateAndTime.getTime();
			return currentDate;
		}
	}