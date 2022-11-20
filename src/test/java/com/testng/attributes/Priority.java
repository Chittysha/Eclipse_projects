package com.testng.attributes;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = -2)
	private void hsc() {
		System.out.println("HSC");
	}

	@Test(priority = -1)
	private void sslc() {
		System.out.println("SSLC");
	}

	@Test
	private void ug() {
		System.out.println("UG");
	}

	@Test(priority = 1)
	private void pg() {
		System.out.println("PG");
	}

}
