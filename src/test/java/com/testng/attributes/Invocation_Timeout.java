package com.testng.attributes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pageobject.manager.Page_Object_Manager;
import com.reader.File_Reader;
import com.utility.files.Base_Class;

public class Invocation_Timeout extends Base_Class {

	public static WebDriver driver = Base_Class.browser_Config("chrome");
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@Test(priority = -2)
	private void session_created() {
		get_Url("https://www.facebook.com/");
		System.out.println("Session_created");
	}

	@Test(priority = -1, invocationCount = 4, invocationTimeOut = 3000)
	private void refresh() {
		navigation_Commands("refresh");
		System.out.println("Refresh");

	}

	@Test
	private void credentials() throws IOException {
		String get_Id = File_Reader.getInstanceFR().getInstanceTD().get_Id();
		send_Keys(manager.getLogin().getId(), get_Id);
		System.out.println("Credentials");

	}

}
