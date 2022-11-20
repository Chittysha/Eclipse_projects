package com.adactin.task;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pageobject.manager.Page_Object_Manager;
import com.reader.File_Reader;
import com.utility.files.Base_Class;

public class Adactin_Task extends Base_Class {

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

		String location = File_Reader.getInstanceFR().getInstanceTD().get_Location();
		select_DropDown(manager.getSearch().getLocation(), "value", location);

		String hotel = File_Reader.getInstanceFR().getInstanceTD().get_Hotel();
		select_DropDown(manager.getSearch().getHotels(), "value", hotel);

		String roomType = File_Reader.getInstanceFR().getInstanceTD().get_RoomType();
		select_DropDown(manager.getSearch().getRoom_Type(), "value", roomType);

		String get_NumOfRooms = File_Reader.getInstanceFR().getInstanceTD().get_NumOfRooms();
		select_DropDown(manager.getSearch().getNum_of_Rooms(), "value", get_NumOfRooms);

		String check_In = File_Reader.getInstanceFR().getInstanceTD().get_CheckIn();
		send_Keys(manager.getSearch().getCheck_In(), check_In);

		String check_Out = File_Reader.getInstanceFR().getInstanceTD().get_CheckOut();
		send_Keys(manager.getSearch().getCheck_Out(), check_Out);

		String adultRoom = File_Reader.getInstanceFR().getInstanceTD().get_AdultRoom();
		select_DropDown(manager.getSearch().getAdult_Room(), "value", adultRoom);

		String childRoom = File_Reader.getInstanceFR().getInstanceTD().get_ChildRoom();
		select_DropDown(manager.getSearch().getChild_Room(), "value", childRoom);

		Click(manager.getSearch().getSearch_Btn());

		Click(manager.getSelect().getRadio_Btn());
		Click(manager.getSelect().getContinue());

		String first_name = File_Reader.getInstanceFR().getInstanceTD().get_FirstName();
		send_Keys(manager.getBook().getFirst_Name(), first_name);

		String last_name = File_Reader.getInstanceFR().getInstanceTD().get_LastName();
		send_Keys(manager.getBook().getLast_Name(), last_name);

		String address = File_Reader.getInstanceFR().getInstanceTD().get_Address();
		send_Keys(manager.getBook().getAddress(), address);

		String cardType = File_Reader.getInstanceFR().getInstanceTD().get_CardType();
		select_DropDown(manager.getBook().getCard_Type(), "visibletext", cardType);

		String expiryMonth = File_Reader.getInstanceFR().getInstanceTD().get_ExpiryMonth();
		select_DropDown(manager.getBook().getExpiry_Month(), "value", expiryMonth);

		String expiryYear = File_Reader.getInstanceFR().getInstanceTD().get_ExpiryYear();
		select_DropDown(manager.getBook().getExpir̥y_Year(), "value", expiryYear);

		String Cvv_No = File_Reader.getInstanceFR().getInstanceTD().get_CvvNo();
		send_Keys(manager.getBook().getCvv_Number(), Cvv_No);

		Click(manager.getBook().getBook_Now_Btn());

		Click(manager.getConfirm().getLogout());

		sleep(3000);

		takes_screen(manager.getConfirm().getLogout());

	}

}
