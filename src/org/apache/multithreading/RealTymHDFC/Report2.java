package org.apache.multithreading.RealTymHDFC;

public class Report2 extends Thread{
	
	@Override
	public void run(){
		HDFCBank.noOfWD();
	}

}
