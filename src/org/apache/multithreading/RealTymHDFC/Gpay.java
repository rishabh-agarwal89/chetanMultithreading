package org.apache.multithreading.RealTymHDFC;

public class Gpay extends Thread{
	
	HDFCBank hdfcBank;
	
	public Gpay(HDFCBank hdfcBank){
		this.hdfcBank = hdfcBank;
	}
	
	@Override
	public void run(){
		hdfcBank.deposit(7000);
	}

}
