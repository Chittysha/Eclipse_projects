package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver; // -------------> null

	@FindBy(xpath = "//td[@align='right']//following::input[@name='username']")
	private WebElement email;

	@FindBy(xpath = "//td[@align='right']//following::input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='login' ]")
	private WebElement login_Btn;

	@FindBy(id = "email")
	private WebElement Id;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	public WebElement getId() {
		return Id;
	}

	public Login_Page(WebDriver driver) {

		this.driver = driver; // -------> runner class driver

		PageFactory.initElements(driver, this);

	}

}
