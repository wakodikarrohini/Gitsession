package com.dataPDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dataprovidersdata.DataProvidersData;

public class dataDemo {
	//data driven testing
	//use data provider class which class to be execute.class
	
	
	@Test(dataProvider="Books data", dataProviderClass= DataProvidersData.class )
	//jitne columns utne String me list of parameters
	public void m1( String BookTitle, String Author) {
		System.out.println("Book Title: " +BookTitle +"\t"+ "Author: "+Author);

	}


}

//by default data provider same class me find Karata hai
//but if this data not in that class so we have to use dataprovider class .class