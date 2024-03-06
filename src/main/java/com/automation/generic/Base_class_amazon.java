package com.automation.generic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class_amazon implements Frame_Work_Constants
{
	public ExtentHtmlReporter reporter;
	ExtentReports reports;
	public  WebDriver driver;
	public ExtentTest test;
	public pom_Amazon_login pal;
	
	@BeforeTest    //Generating the report
	public  void Reports()
	{
		reporter=new ExtentHtmlReporter(Extent_path);
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		test = reports.createTest(Extent_path);
	}
	
	@BeforeClass   //Open the browser
	public void Openapp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod   //logging into the application
	public  void Loginamazon()
	{
		driver.get(URL);
		
		pal=new pom_Amazon_login(driver);
		pal.signIn().click();
		pal.userName().sendKeys(UN);
		pal.userNameButton().click();
		pal.password_field().sendKeys(PASS);
		pal.passWordbutton().click();
	}
	
	@AfterMethod
	public void logout()
	{
		//pal.logOut().click();
	}
	
	@AfterClass
	public void closeapp()
	{
		driver.quit();
	}
	
	@AfterTest
	public void flush()
	{
		
		reports.flush();
	}
	
}














