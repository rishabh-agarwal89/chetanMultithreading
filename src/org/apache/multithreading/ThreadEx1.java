package org.apache.multithreading;

public class ThreadEx1 extends Thread{
	
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1();
		t1.start();		
		
		ThreadEx1 t2 = new ThreadEx1();
		t2.start();
		
		System.out.println("Main Thread Running");
	}
	
	@Override
	public void run(){
		System.out.println("Child Thread Running");
	}

}
