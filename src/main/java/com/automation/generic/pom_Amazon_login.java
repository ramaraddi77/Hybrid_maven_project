package com.automation.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pom_Amazon_login extends base_test_constructor
{
	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement sign_in_btn;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement username_field;
	
	@FindBy(id = "continue")
	private WebElement username_btn;
	
	@FindBy(id = "ap_password")
	private WebElement password_field;
	
	@FindBy(id = "signInSubmit")
	private WebElement password_btn;
	
	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement logout_btn;
	
	
	public pom_Amazon_login(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement signIn()
	{
		return sign_in_btn;
	}
	
	public WebElement userName()
	{
		return username_field;
	}
	public WebElement userNameButton()
	{
		return username_btn;
	}
	public WebElement password_field()
	{
		return password_field;
	}
	public WebElement passWordbutton()
	{
		return password_btn;
	}
	
	public WebElement logOut()
	{
		return logout_btn;
	}

}
