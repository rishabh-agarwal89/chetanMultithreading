package org.apache.multithreading.RealTymHDFC;

public class HDFCBank {
	
	static Integer noOfAccount=0;
	static Integer noOfDeposit=0;
	static Integer noOfWD=0;
	
	Integer bankB = 0;
	
	public HDFCBank(Integer initialAmt){
		this.bankB = initialAmt;
		noOfAccount++;
	}

	// actions
	public synchronized void deposit(Integer depositAmt) {
		bankB = bankB + depositAmt;
		
		noOfDeposit++;

	}

	public synchronized void withdraw(Integer depositAmt) {
		bankB = bankB - depositAmt;
		noOfWD++;
	}
	
	public void profileUpdate(){
		System.out.println("Profile Updation Successul!!");
	}
	
	public void blanceCheck(){
		System.out.println("Checked Blance" + bankB);
	}
	
	//Now we will go for static method i.e. Class Level Lock, so here in each
	//of static methods where race condition can occur we should have synchronized
	public static synchronized void noOfAccount(){
		System.out.println("noOfAccount" + noOfAccount);
	}
	
	public static synchronized void  noOfDeposit(){
		System.out.println("noOfDeposit" + noOfDeposit);
	}
	
	public static synchronized void noOfWD(){
		System.out.println("noOfWD" + noOfWD);
	}

}
