package com.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {

	@Test
	private void verifyHomePage() {

		String excepted_Title = "Instagram";

		String actual_Title = "Facebook";

		Assert.assertEquals(actual_Title, excepted_Title);

		System.out.println("Validation Success");

	}
	
	
	
	
	

}
