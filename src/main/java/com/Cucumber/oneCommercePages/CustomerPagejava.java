package com.Cucumber.oneCommercePages;

import com.CucmberOneCommerce.Steps.TestContext;

import WebDriverManager.WebdriverManager;

public class CustomerPagejava {
		
	public WebdriverManager app;
	public TestContext context;
	public CustomerPagejava(WebdriverManager app)
	{
		this.app=app;
		System.out.println("CustomerPageJava Construtor");
	}
	
	
	//Click on customer page method
	public void ClickCustomerMenu(String locator)
	{
		//app.ClickSideMenuItem("Customers");
		//app.IsElementPresent(locator, 30);
		System.out.println("customer menu ----"+locator);
		//app.Click(locator);
	}
	
	
	public void ClickCustomerSubMenu(String locator)
	{
		//app.ClickSubMenuItem("Customers",1);	
		//app.IsElementPresent(locator, 30);
	//	app.Click(locator);
		System.out.println("customer Submenu ----"+locator);

	}

	
	public void clickAddCustomer(String locator)
	{
		//app.WaitForElement(locator, 25);
		//app.IsElementPresent(locator, 30);
		//app.Click(locator);
		System.out.println("customer add customer ----"+locator);

	}
	
	
	public void EnterCustomerDetails( )
	{
		/*app.TypeInTextField("input_Email_id");
		app.TypeInTextField("input_Firstname_id");
		app.TypeInTextField("input_Lastname_id");
		app.TypeInTextField("input_password_id");
		app.Click("radio_Male");
		app.TypeInTextField("input_Email_id");*/
		System.out.println("Enter customer details menu ----");


	}
	
	
}
