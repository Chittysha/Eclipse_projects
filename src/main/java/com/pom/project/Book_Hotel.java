package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver; // ------------> null

	@FindBy(xpath = "//td[@align='right']//following::input[@name='first_name']")
	private WebElement First_Name;

	@FindBy(xpath = "//td[@align='right']//following::input[@name='last_name']")
	private WebElement Last_Name;

	@FindBy(xpath = "//td[@align='right']//following::textarea[@name='address']")
	private WebElement Address;

	@FindBy(xpath = "//td[@align='right']//following::input[@name='cc_num']")
	private WebElement Card_No;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='cc_type']")
	private WebElement Card_Type;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='cc_exp_month']")
	private WebElement Expiry_Month;

	@FindBy(xpath = "//td[@align='right']//following::select[@name='cc_exp_year']")
	private WebElement Expir̥y_Year;

	@FindBy(xpath = "//td[@align='right']//following::input[@name='cc_cvv']")
	private WebElement Cvv_Number;

	@FindBy(xpath = "//input[@type='button' or @name='book_now']")
	private WebElement Book_Now_Btn;

	public Book_Hotel(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCard_No() {
		return Card_No;
	}

	public WebElement getCard_Type() {
		return Card_Type;
	}

	public WebElement getExpiry_Month() {
		return Expiry_Month;
	}

	public WebElement getExpir̥y_Year() {
		return Expir̥y_Year;
	}

	public WebElement getCvv_Number() {
		return Cvv_Number;
	}

	public WebElement getBook_Now_Btn() {
		return Book_Now_Btn;
	}

}
