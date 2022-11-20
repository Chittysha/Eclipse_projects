package com.testng.attributes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utility.files.Base_Class;

public class Parallel_Runner {

	public static WebDriver driver;

	@BeforeClass
	private void launch() {

		driver = Base_Class.browser_Config("chrome");

	}

	@Test
	private void facebook() {
		driver.get("https://www.facebook.com/");

	}

	@Test
	private void instagram() {
		driver.get("https://www.instagram.com/");
	}

	@AfterClass
	private void browser_close() {
		driver.close();
	}
}
