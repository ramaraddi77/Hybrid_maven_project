package com.automation.generic;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.automation.generic.Listeners_class.class)
public class testscripts extends Base_class_amazon
{
	@Test
	public void testscriptsamazon()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ram");
		//driver.findElement(By.id("sagar"));
		}
}
