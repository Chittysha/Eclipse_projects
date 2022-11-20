package com.testng.attributes;

import org.testng.annotations.Test;

public class GroupofGroups {

	@Test(groups = "Lap")
	private void laptop() {
		System.out.println("laptop");
	}

	@Test(groups = "Bluetooth")
	private void earphones() {
		System.out.println("Earphones");
	}

	@Test(groups = "Social Media")
	private void insta() {
		System.out.println("Instagram");
	}

	@Test(groups = "Rarely used")
	private void whatsapp() {
		System.out.println("WhatsApp");
	}

	@Test(groups = "Favourite")
	private void choco() {
		System.out.println("Chocolates");
	}

	@Test(groups = "Zoom")
	private void session() {
		System.out.println("Project Session");
	}

}
