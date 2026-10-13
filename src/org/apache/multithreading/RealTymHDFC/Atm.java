package org.apache.multithreading.RealTymHDFC;

public class Atm extends Thread{
	
	HDFCBank hdfcBank;
	
	public Atm(HDFCBank hdfcBank){
		this.hdfcBank = hdfcBank;
	}
	
	@Override
	public void run(){
		hdfcBank.withdraw(5000);
	}

}
