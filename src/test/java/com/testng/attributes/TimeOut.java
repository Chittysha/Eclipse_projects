package com.testng.attributes;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageobject.manager.Page_Object_Manager;
import com.reader.File_Reader;
import com.utility.files.Base_Class;

public class TimeOut extends Base_Class {

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@Test(timeOut = 5000)
	private void login() throws IOException, InterruptedException {

		browser_Config("chrome");
		get_Url("https://www.facebook.com/");
		sleep(2000);
		implicitly_Wait(3000);
		String id = File_Reader.getInstanceFR().getInstanceTD().get_Id();
		send_Keys(manager.getLogin().getId(), id);

	}

}
