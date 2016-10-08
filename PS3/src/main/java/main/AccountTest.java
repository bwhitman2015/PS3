package main;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AccountTest {
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private int id;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	



	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		AccountTest testAccount = new Account();
		
		testAccount.setId(5);			//test set id method
		testAccount.setBalance(500);	//test set balance method
	
		testAccount.withdraw(600);
	}




	private void setId(int id) {
		this.id = id;
		// TODO Auto-generated method stub
		
	}

	private void setBalance(int i) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testAccount() throws InsufficientFundsException {
		int idNumber = 1122;
		double balance = 20000;
		double withdraw = 2500;
		double deposit = 3000;
		double AnnualInterest = 4.5;
		Account testAccount = new Account(idNumber, balance);
		testAccount.setAnnualInterestRate(AnnualInterest);
		assertEquals(testAccount.getAnnualInterestRate(), AnnualInterest,.001);
	
		assertEquals(testAccount.getId(), idNumber, 0);
		
		double TakeMoneyAway = balance - withdraw;
		testAccount.withdraw(withdraw);
		
		
		
		double moneyInTheBank = balance - withdraw + deposit;
		testAccount.deposit(deposit);
		(testAccount.getBalance(), moneyInTheBank, .001);
		
		System.out.println("Balance is: $" + testAccount.getBalance());
		System.out.println("Monthly Interest Rate is: " +testAccount.getMonthlyRate() +"%");
		System.out.println("Date Created is: " + testAccount.getDateCreated());

	}

}