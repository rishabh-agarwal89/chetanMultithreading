package org.apache.multithreading.RealTymHDFC;

public class BlanceCheck extends Thread{
	
	HDFCBank hdfcBank;
	
	public BlanceCheck(HDFCBank hdfcBank){
		this.hdfcBank = hdfcBank;
	}
	
	@Override
	public void run(){
		hdfcBank.blanceCheck();
	}
}
