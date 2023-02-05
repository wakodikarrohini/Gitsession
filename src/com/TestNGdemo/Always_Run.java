package com.TestNGdemo;

import org.testng.annotations.Test;

public class Always_Run {
//soft dependency
	@Test
	public void m2(){
		System.out.println("m2 test case");	


	}
	@Test//m5 failed
	public void m5(){
		System.out.println("m5 test case");	
		throw new AssertionError();

	}
	@Test
	public void m1(){
		System.out.println("m1 test case");	


	}
	//m3 passed not skip
	//always run regardless of any situation/dependency
	//no use of this method
	//mixture of this two is soft dependency
	
	
	@Test(dependsOnMethods ={"m5"},alwaysRun = true)
	public void m3(){
		System.out.println("m3 test case");	


	}
	@Test
	public void m4(){
		System.out.println("m4 test case");	


	}
	@Test
	public void m6(){
		System.out.println("m6 test case");	


	}

}
