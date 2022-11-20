package com.testng.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.files.Base_Class;

public class Assert_Example {

	public static WebDriver driver = Base_Class.browser_Config("chrome");

	@Test
	private void Launch_Url() throws InterruptedException {

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();

		Thread.sleep(2000);

		String expected_Url = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";

		Assert.assertEquals(driver.getCurrentUrl(), expected_Url);

		System.out.println("Find Your Account");
	}

}
