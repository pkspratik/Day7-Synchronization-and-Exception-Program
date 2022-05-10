package com.package1.day7;

public class Test_sno {

	public static void main(String[] args) {
		
		try {
		for(int i=0; i<=10; i++)
		{
			
			System.out.println(i);
			
			Thread.sleep(3000);
		}
		}catch(Exception e) {
			//e.getStackTrace();
			System.err.println(e); // this is for error massage
		}
		
		// TODO Auto-generated method stub

	}

}
