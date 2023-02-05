
package com.dataprovidersdata;

import org.testng.annotations.DataProvider;

public class DataProvidersData {

	@DataProvider(name="Books data")
	public Object[] [] dataprovider() {//method

		Object [][] obj= {{"Oldman and the sea","Ernest hamingway"},
				{"Sun also rises","Ernest hamingway"},
				{"Kosala","Bhalchandra Nemade"},
				{"Raavan","Sharad Tandale"},
				{"Half Girlfriend","Chetan Bhagat"}
		};
		return obj;
	}
	@DataProvider(name="Order Data")
	public Object [] [] order() {    //method
		Object [] [] obj=null;
		return obj;
	}
}
//ek row hai to ek bar run hogi
//5 row hai to 5 bar run hogi