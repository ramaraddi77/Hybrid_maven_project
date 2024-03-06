package com.automation.generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_class extends Base_class_amazon implements ITestListener
{
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case pass");
	}
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test case is fail"+result.getName());
		Screenshot_class.getphoto(this.driver, result);
	}
}
