package com;

import com.Bank.Account;
import com.Bank.Branch;
import com.Bank.Customer;

public class Bank{
	static class Customer{
		
		public void go()
		{
			System.out.println("inside Customer");
		}
	}
	
	
	static class Account extends Customer
	{
		public void go()
		{
			System.out.println("inside Account"); 
		}
	}
	
	static class Branch extends Customer
	{
		@Override
		public void go()
		{
			System.out.println("inside Branch");			
		}
	}
	
	public static void main(String [] args)
	{
		Customer cust = new Account();
		Branch branch = (Branch)cust;
		branch.go();
		//cust.go();
	}
}
