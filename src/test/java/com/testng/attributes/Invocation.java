package com.testng.attributes;

import org.testng.annotations.Test;

public class Invocation {

	@Test(priority = -2)
	private void session_created() {
		System.out.println("Session Created");
	}

	@Test(priority = -1, invocationCount = 5)
	private void refresh() {
		System.out.println("Refresh");
	}

	@Test
	private void credentials() {
		System.out.println("Credentials");

	}

}
