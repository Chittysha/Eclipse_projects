package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {

	public WebDriver driver; // ---------> null

	@FindBy(xpath = "//td[@width='150']//following::select[@name='location']")
	private WebElement Location;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='hotels']")
	private WebElement Hotels;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='room_type']")
	private WebElement Room_Type;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='room_nos']")
	private WebElement Num_of_Rooms;

	@FindBy(xpath = "//td[@align='right']//following::input[@name='datepick_in']")
	private WebElement Check_In;

	@FindBy(xpath = "//td[@align='right']//following::input[@name='datepick_out']")
	private WebElement Check_Out;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='adult_room']")
	private WebElement Adult_Room;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='child_room']")
	private WebElement Child_Room;

	@FindBy(xpath = "//input[@value='Search' and @name='Submit']")
	private WebElement Search_Btn;

	public Search_Hotel_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoom_Type() {
		return Room_Type;
	}

	public WebElement getNum_of_Rooms() {
		return Num_of_Rooms;
	}

	public WebElement getCheck_In() {
		return Check_In;
	}

	public WebElement getCheck_Out() {
		return Check_Out;
	}

	public WebElement getAdult_Room() {
		return Adult_Room;
	}

	public WebElement getChild_Room() {
		return Child_Room;
	}

	public WebElement getSearch_Btn() {
		return Search_Btn;
	}

}
