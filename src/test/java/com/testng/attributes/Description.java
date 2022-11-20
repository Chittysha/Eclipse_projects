package com.testng.attributes;

import org.testng.annotations.Test;

public class Description {

	@Test(priority = 0, description = "UG Method")
	private void ug() {
		System.out.println("UG");
	}

	@Test(priority = 1, description = "PG Method")
	private void pg() {
		System.out.println("PG");
	}

}
