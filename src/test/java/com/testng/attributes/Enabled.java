package com.testng.attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enabled {

	@Test
	private void laptop() {
		System.out.println("laptop");
	}

	@Test
	private void earphones() {
		System.out.println("Earphones");
	}

	@Test
	private void insta() {
		System.out.println("Instagram");
	}

	@Test
	private void whatsapp() {
		System.out.println("WhatsApp");
	}

	@Test(enabled = false,alwaysRun = true)
	private void books() {
		System.out.println("Books");
	}

	@Ignore
	@Test
	private void session() {
		System.out.println("Session");
	}

}
