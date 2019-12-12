package com.dac.copy;

public class Account implements Cloneable
{
	
	private int balance;

	public int getBalance() 
	{
		return balance;
	}

	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}