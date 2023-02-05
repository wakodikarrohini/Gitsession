package com.TestNGdemo;

import org.testng.annotations.Test;

public class TestNGparameter1 {




	@Test(priority=0)
	public void m2(){
		System.out.println("m2 test case");	

	}
	@Test(expectedExceptions= {ArithmeticException.class,ArrayIndexOutOfBoundsException.class})
	public void m5() throws InterruptedException {
		System.out.println("m5 test case");	
		throw new ArithmeticException();

	}
	@Test(expectedExceptions= {ArithmeticException.class})//m1 will fail
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



