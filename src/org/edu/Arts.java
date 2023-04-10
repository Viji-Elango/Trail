package org.edu;

public class Arts extends Education{

	
	//Override
	
	public void bSc() {
		
		System.out.println("Bsc----150 Students");
		
	}
	private void bEd() {
		
		System.out.println("BEd----150 Students");
	}
	private void bA() {
		
		System.out.println("BA----100 Students");
	}
	private void bBA() {
		
		System.out.println("BBA----50 Students");
	}
	public void ug() {
		
		int a = 487;
		System.out.println("UG Courses----" +a+ " Students");
		
		
	}
	
	public void pg() {
		System.out.println("PG Courses---30 Students");
	}
	
	public static void main(String args[])
	{
		Arts a = new Arts();
		a.ug();
		a.pg();
		a.bA();
		a.bBA();
		a.bEd();
		a.bSc();
		
	}
}
