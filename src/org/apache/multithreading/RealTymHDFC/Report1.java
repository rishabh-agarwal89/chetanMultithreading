package org.apache.multithreading.RealTymHDFC;

public class Report1 extends Thread{
	
	@Override
	public void run(){
		HDFCBank.noOfDeposit();
	}

}
