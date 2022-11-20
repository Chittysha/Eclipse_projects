package com.testng.attributes;

import org.testng.annotations.Test;

public class DP_RunnerClass {

	@Test(priority = 1, dataProvider = "data_values", dataProviderClass = DP_UtlilityClass.class)
	private void username(String email, String pass) {

		System.out.println("email by dp:" + email);
		System.out.println("pass by dp:" + pass);
	}

	@Test(dependsOnMethods = "username", dataProvider = "address", dataProviderClass = DP_UtlilityClass.class)
	private void address_Details(String number, String address) {

		System.out.println("Number :" + number);
		System.out.println("Address :" + address);
	}
}
