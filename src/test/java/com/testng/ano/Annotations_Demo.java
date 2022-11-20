package com.testng.ano;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {

	@BeforeSuite
	public void set_Property() {
		System.out.println("Set Property");
	}

	@AfterSuite
	private void delete_Cookies() {
		System.out.println("Cookies Deleted");
	}

	@BeforeClass
	private void launch_Url() {
		System.out.println("Url Launched");
	}

	@AfterClass
	private void in_HomePage() {
		System.out.println("In Homepage");
	}

	@BeforeTest
	private void browser_open() {
		System.out.println("Browser Open");
	}

	@AfterTest
	private void browser_close() {
		System.out.println("Browser Close");
	}

	@Test
	private void casual_Dress() {
		System.out.println("Casual Dress");
	}

	@Test
	private void summer_Dress() {
		System.out.println("Summer Dress");
	}

	@Test
	private void evening_Dress() {
		System.out.println("Evening Dress");
	}

	@BeforeMethod
	private void log_In() {
		System.out.println("Login");
	}

	@AfterMethod
	private void log_Out() {
		System.out.println("Logout");
	}

}
