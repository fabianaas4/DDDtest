package com.vicentry.lab.pages;

import com.vicentry.lab.initializer.Initializer;
import com.vicentry.lab.initializer.Locator;

public class LoginPage extends Initializer {

	// username - type, password - type , login - click, signup - click

	public static void enterUsername(String data) {
		Locator.getElementByname("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys(data);

	}

	public static void enterPassword(String data) {
		Locator.getElementByname("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys(data);
	}

	public static void clickLogin() {
		Locator.getElementByname("LOGINPAGE_TYPE_PASSWORD_NAME").submit();

	}

	public static void clickSignIn() {
		Locator.getElementByLinkText("LOGINPAGE_CLICK_SIGNUP_LINKTEXT").click();
		

	}

	

	}

