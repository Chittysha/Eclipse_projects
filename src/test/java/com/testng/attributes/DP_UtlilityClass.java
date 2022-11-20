package com.testng.attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_UtlilityClass {

	@DataProvider
	private String[][] data_values() {

		String[][] name = {

				{ "Rose", "rose10" }, { "Lily", "lily12" }, { "Lavender", "lavender25" }

		};

		return name;
	}

	@Test(dataProvider = "data_values")
	private void login(String username, String password) {

		System.out.println("username :" + username);
		System.out.println("password :" + password);
	}

	@DataProvider
	private String[][] address() {

		String[][] addrs = {

				{ "No.26,", "london" }, { "No.27,", "Paris" }, { "No.28,", "New York" }

		};

		return addrs;

	}

	@Test(dataProvider = "address")
	private void adds(String number, String landmark) {

		System.out.println("number :" + number);
		System.out.println("landmark :" + landmark);
	}

}
