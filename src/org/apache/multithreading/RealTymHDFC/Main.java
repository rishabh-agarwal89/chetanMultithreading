package org.apache.multithreading.RealTymHDFC;

public class Main {
	
	public static void main(String[] args) {
		
		Integer anand = 10000;
		Integer kuldeep = 18000;
		
		HDFCBank bank = new HDFCBank(anand);
		
		HDFCBank bank1 = new HDFCBank(kuldeep);
		
		Atm atm = new Atm(bank);
		atm.setName("ATM");
		atm.start();
		
		Gpay gpayAnand = new Gpay(bank);
		gpayAnand.setName("GpayAnand");
		gpayAnand.start();
		
		Gpay gpayKuldeep = new Gpay(bank1);
		gpayKuldeep.setName("Gpay");
		gpayKuldeep.start();
		
		Profile profile = new Profile(bank);
		profile.setName("Profile Anand");
		profile.start();
		
		BlanceCheck blanceCheck = new BlanceCheck(bank);
		blanceCheck.setName("BlanceCheck Anand");
		blanceCheck.start();
		
		Report report = new Report();
		report.setName("noOfAccount");
		report.start();
		
		Report report1 = new Report();
		report1.setName("Deposit");
		report1.start();
		
		Report report2 = new Report();
		report2.setName("WD");
		report2.start();
		
		
		System.out.println("Total Amt" + bank.bankB);
		System.out.println("Total Amt" + bank1.bankB);
	}

	//ATM org.apache.multithreading.RealTymHDFC.HDFCBank@6f3c7576
	//Gpay org.apache.multithreading.RealTymHDFC.HDFCBank@3e7ac507
}
