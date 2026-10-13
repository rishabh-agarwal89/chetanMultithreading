package org.apache.multithreading.RealTymHDFC;

public class Report extends Thread{
	
	@Override
	public void run(){
		HDFCBank.noOfAccount();
	}

}
