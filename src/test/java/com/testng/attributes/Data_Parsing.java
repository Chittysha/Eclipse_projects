package com.testng.attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Parsing {

	@DataProvider
	private String[][] data_values() {

		String[][] values = {

				{ "Rose", "rose10" }, { "Lily", "lily12" }, { "Lavender", "lavender25" }

		};

		return values;
	}

	@Test(dataProvider = "data_values")
	private void login(String username, String password) {

		System.out.println("username :" + username);
		System.out.println("password :" + password);
	}

}
