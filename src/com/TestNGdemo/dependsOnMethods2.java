package com.TestNGdemo;

import org.testng.annotations.Test;

public class dependsOnMethods2 {


	@Test
	public void m2(){
		System.out.println("m2 test case");	


	}
	//m5 failed
	@Test
	public void m5(){
		System.out.println("m5 test case");	
		throw new AssertionError();
	}
	@Test
	public void m1(){
		System.out.println("m1 test case");	

	}
	//called hard dependency
	//m3 skip
	//depends on not successfully finished methods.
	//m3 takes part in execution but not able to run so called skip
	@Test(dependsOnMethods= {"m5"})
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
