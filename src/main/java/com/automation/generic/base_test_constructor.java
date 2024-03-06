package com.automation.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base_test_constructor
{
	public base_test_constructor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
