package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver; //-------------> null
	
	@FindBy(xpath = "//td[@bgcolor='#FFFFFF']//child::input[@name='radiobutton_0']")
	private WebElement Radio_Btn;
	
	@FindBy(xpath = "//td[@align='center']//child::input[@name='continue']")
	private WebElement Continue;

	public Select_Hotel(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_Btn() {
		return Radio_Btn;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	

}
