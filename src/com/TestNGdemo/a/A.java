package com.TestNGdemo.a;

import org.testng.annotations.Test;

import com.config.Config;

public class A extends Config{
	
	@Test
	public void m1() {
		System.out.println("m1 of A");
	}
	
	@Test(groups={"Sanity"})
	public void m2() {
		System.out.println("m2 of A");
	}
	@Test
	public void m3() {
		System.out.println("m3 of A");
	}
	@Test
	public void m4() {
		System.out.println("m4 of A");
	}
	@Test
	public void m5() {
		System.out.println("m5 of A");
	}
	
	@Test(groups={"Sanity"})
	public void m6() {
		System.out.println("m6 of A");
	}
	
	@Test
	public void m7() {
		System.out.println("m7 of A");
	}
	

}
