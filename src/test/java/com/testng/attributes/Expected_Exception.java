package com.testng.attributes;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = NullPointerException.class)
	private void calculator() {

		int a = 10;
		System.out.println(a / 0);
	}

}
