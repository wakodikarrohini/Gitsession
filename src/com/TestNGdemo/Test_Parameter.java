package com.TestNGdemo;

import org.testng.annotations.Test;

public class Test_Parameter {



	@Test(priority=0)
	public void m2(){
		System.out.println("m2 test case");	

	}
	@Test(timeOut=4000)
	public void m5() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("m5 test case");	


	}
	@Test(priority=-2)
	public void m1()  {

		System.out.println("m1 test case");	



	}
	@Test(priority=3)
	public void m3() {
		System.out.println("m3 test case");	


	}
	@Test(priority=4)
	public void m4() {
		System.out.println("m4 test case");	


	}
	@Test(priority=6)
	public void m6() {

		System.out.println("m6 test case");	

	}



}
