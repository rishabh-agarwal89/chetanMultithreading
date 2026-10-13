package org.apache.multithreading.RealTymHDFC;

public class Profile extends Thread{

	HDFCBank hdfcBank;
	
	public Profile(HDFCBank hdfcBank){
		this.hdfcBank = hdfcBank;
	}
	
	@Override
	public void run(){
		hdfcBank.profileUpdate();
	}
}

