package com.singleton;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pageobject.manager.Page_Object_Manager;
import com.reader.File_Reader;
import com.utility.files.Base_Class;

public class singleton_task extends Base_Class {

	public static WebDriver driver = browser_Config("chrome");
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		implicitly_Wait(5);
		get_Url("https://adactinhotelapp.com/");

		String username = File_Reader.getInstanceFR().getInstanceTD().get_Username();
		send_Keys(manager.getLogin().getEmail(), username);

		String password = File_Reader.getInstanceFR().getInstanceTD().get_Password();
		send_Keys(manager.getLogin().getPassword(), password);

		Click(manager.getLogin().getLogin_Btn());

		select_DropDown(manager.getSearch().getLocation(), "value", "Paris");
		select_DropDown(manager.getSearch().getHotels(), "value", "Hotel Sunshine");
		select_DropDown(manager.getSearch().getRoom_Type(), "value", "Deluxe");
		select_DropDown(manager.getSearch().getNum_of_Rooms(), "value", "2");

		String check_In = File_Reader.getInstanceFR().getInstanceTD().get_CheckIn();
		send_Keys(manager.getSearch().getCheck_In(), check_In);

		String check_Out = File_Reader.getInstanceFR().getInstanceTD().get_CheckOut();
		send_Keys(manager.getSearch().getCheck_Out(), check_Out);

		select_DropDown(manager.getSearch().getAdult_Room(), "value", "3");
		select_DropDown(manager.getSearch().getChild_Room(), "value", "2");
		Click(manager.getSearch().getSearch_Btn());

		Click(manager.getSelect().getRadio_Btn());
		Click(manager.getSelect().getContinue());

		String first_name = File_Reader.getInstanceFR().getInstanceTD().get_FirstName();
		send_Keys(manager.getBook().getFirst_Name(), first_name);

		String last_name = File_Reader.getInstanceFR().getInstanceTD().get_LastName();
		send_Keys(manager.getBook().getLast_Name(), last_name);

		String address = File_Reader.getInstanceFR().getInstanceTD().get_Address();
		send_Keys(manager.getBook().getAddress(), address);

		String Card_No = File_Reader.getInstanceFR().getInstanceTD().get_CardNo();
		send_Keys(manager.getBook().getCard_No(), Card_No);

		select_DropDown(manager.getBook().getCard_Type(), "visibletext", "American Express");
		select_DropDown(manager.getBook().getExpiry_Month(), "value", "5");
		select_DropDown(manager.getBook().getExpir̥y_Year(), "value", "2022");

		String Cvv_No = File_Reader.getInstanceFR().getInstanceTD().get_CvvNo();
		send_Keys(manager.getBook().getCvv_Number(), Cvv_No);

		Click(manager.getBook().getBook_Now_Btn());

		Click(manager.getConfirm().getLogout());

		sleep(3000);

		takes_screen(manager.getConfirm().getLogout());

	}

}
