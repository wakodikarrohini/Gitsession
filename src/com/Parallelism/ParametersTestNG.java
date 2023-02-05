package com.Parallelism;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.config.Config;

public class ParametersTestNG extends Config{

	@Test
	public void m2(){
		System.out.println("m2 test case");	


	}
	@Test
	public void m5(){
		System.out.println("m5 test case");	
		throw new AssertionError();
	}
	//org.testng.TestNGException: 
	//Parameter 'num1' is required by @Test on method m1 but has not been marked @Optional or defined
	
	
	@Parameters({"num1","num2"})
	@Test
	public void m1(String num1,String num2){
		System.out.println("m1 test case: "+num1+"\t"+num2);	


	}
	@Test(dependsOnMethods = {"m5"},alwaysRun =true)
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
