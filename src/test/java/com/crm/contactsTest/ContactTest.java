package com.crm.contactsTest;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test(groups="smokeTest")
	public void createContact()
	{
		System.out.println("execute createContact");
	}

	@Test(groups="regressionTest")
	public void modifyContact()
	{
		System.out.println("execute modifyContact");
		System.out.println("execute modifyContact22");
	}

	@Test(groups="regressionTest")
	public void deleteContact()
	{
		System.out.println("execute deleteContact");
	}

}
