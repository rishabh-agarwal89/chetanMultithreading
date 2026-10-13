package org.apache.multithreading;

public class MyRunnableThreadEx2 implements Runnable{
	
	public static void main(String[] args) {
		MyRunnableThreadEx2 myRunnableThreadEx2 = new MyRunnableThreadEx2();
		Thread t = new Thread(myRunnableThreadEx2);
		t.start();
		System.out.println("Main Thread Running");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Thread Running");
		
	}

}
