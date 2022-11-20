package com.testng.attributes;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Validation {

	@Test
	private void soft_validation() {

		String excepted_Title = "Instagram";

		String actual_Title = "Facebook";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(actual_Title, excepted_Title);

		soft.assertAll();

		System.out.println("Verification Success");

	}
}