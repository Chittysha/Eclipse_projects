package com.testng.attributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_Data {

	@Parameters({ "Id", "Pass" })
	@Test
	private void credentials_login(String Username, String Password) {

		System.out.println("username :" + Username);
		System.out.println("password :" + Password);

	}

	@Parameters({ "First", "Last" })
	@Test(priority = 1)
	private void SurName(String FirstName, String LastName) {  //@optioal("")

		System.out.println("FirstName :" + FirstName);
		System.out.println("LastName :" + LastName);
	}

}
