package com.testng.attributes;

import org.testng.annotations.Test;

public class Group {

	@Test(groups = "Electronics")
	private void laptop() {
		System.out.println("laptop");
	}

	@Test(groups = "Electronics")
	private void earphones() {
		System.out.println("Earphones");
	}

	@Test(groups = "Social Media")
	private void insta() {
		System.out.println("Instagram");
	}

	@Test(groups = "Social Media")
	private void whatsapp() {
		System.out.println("WhatsApp");
	}

	@Test(groups = "Untouchable")
	private void books() {
		System.out.println("Books");
	}

	@Test(groups = "Untouchable")
	private void session() {
		System.out.println("Session");
	}

}
