package com.junit.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Data {

	@Test
	public void casual_Dress() {

		System.out.println("Casual Dress");

	}

	@Test
	public void Summer_Dress() {

		System.out.println("Summer Dress");

	}

	@Test

	public void Evening_Dress() {

		System.out.println("Evening Dress");

	}

	@Before

	public void Log_In() {
		System.out.println("Login");

	}

	@After

	public void Log_out() {

		System.out.println("Logout");
	}

	@BeforeClass

	public static void login() {

		System.out.println("Login Successfully");
	}

	@AfterClass

	public static void logout() {
		System.out.println("Logout Successfully");
	}

}
