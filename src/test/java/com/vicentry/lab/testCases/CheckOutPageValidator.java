package com.vicentry.lab.testCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Throwables;
import com.relevantcodes.extentreports.LogStatus;
import com.vicentry.lab.initializer.Initializer;
import com.vicentry.lab.initializer.Locator;
import com.vicentry.lab.inputReader.InputReader;
import com.vicentry.lab.pages.CheckoutPage;
import com.vicentry.lab.pages.HomePage;
import com.vicentry.lab.pages.LoginPage;
import com.vicentry.lab.screenshotgenerator.ScreenshotGenerator;

public class CheckOutPageValidator extends Initializer {
	@BeforeTest
	public void setUp() throws Exception {
		// initialize(); // opens the browser

	}

	@Test(dataProvider = "CheckoutTest")
	// 0, 1, 3, 4, 5, 6, 7, 8
	public void validaCheckoutPage(String testdata, String user, String password, String productname, String mobile,
			String email, String prodcat, String productQty, String purchaser)
			throws IOException, InterruptedException {
		initialize();
		
		log=reports.startTest("start "+testdata, "validate - "+testdata);
		log.log(LogStatus.PASS, testdata+" -  initialized");
		// initialize(); //opens the browser

		wd.get(envProp.getProperty("URL"));
		log.log(LogStatus.PASS, "url loaded successfully");
		/*
		 * //step 1
		 * 
		 * wd.findElement(By.name("username")).sendKeys("fabiana");
		 * wd.findElement(By.name("password")).sendKeys("laikaLAIKA7");
		 * wd.findElement(By.name("password")).submit();
		 */

		/*
		 * //step 2 wd.findElement(By.name(LocaterProp.getProperty(
		 * "LOGINPAGE_TYPE_USERNAME_NAME"))).sendKeys("fabiana");
		 * wd.findElement(By.name(LocaterProp.getProperty(
		 * "LOGINPAGE_TYPE_PASSWORD_NAME"))).sendKeys("laikaLAIKA7");
		 * wd.findElement(By.name(LocaterProp.getProperty(
		 * "LOGINPAGE_TYPE_PASSWORD_NAME"))).submit();
		 */

		/*
		 * // step 3
		 * Locator.getElementByname("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys(
		 * "fabiana");
		 * Locator.getElementByname("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys(
		 * "laikaLAIKA7");
		 * Locator.getElementByname("LOGINPAGE_TYPE_PASSWORD_NAME").submit();
		 */

		// Step 4 - page object - readable, resuable, maintanable
		LoginPage.enterUsername(user);// index 0
		LoginPage.enterPassword(password);// 1
		LoginPage.clickLogin();
		log.log(LogStatus.PASS, "login completed successfully");
		
		wd.get(envProp.getProperty("LAB_URL"));
		HomePage.clickFrameworkForm();
		HomePage.clickSimpleForm();
		log.log(LogStatus.PASS, "home page completed successfully");
	
		CheckoutPage.enterProductName(productname);// 2
		CheckoutPage.enterMobile(mobile);// 3
		CheckoutPage.enterEmail(email);// 4
		CheckoutPage.selectProdCat(prodcat);// 5

		CheckoutPage.enterProductQty(productQty);// 6
		CheckoutPage.enterPurchaserName(purchaser);// 7

		CheckoutPage.clickGst();

		CheckoutPage.clickCOD();

		CheckoutPage.clickPlaceOrder();
		log.log(LogStatus.PASS, "checkout page competed successfully");

		reports.startTest("checkout page " + testdata + "completed", "validated" + testdata);

	}

	@DataProvider(name = "CheckoutTest")
	public static Object[][] getData() throws IOException {

		if (InputReader.verifyRunMode("CheckOutPageValidator")) {
			Object[][] data = InputReader.verifyMultiData("CheckOutPageValidator");

			return data;
		}

		return null;
	}

	@AfterMethod
	public void tearDown(ITestResult r) throws InterruptedException, IOException {
		//logout
		ScreenshotGenerator.generateScreenshot(r);
		HomePage.clickLogout();
		
	}

	
	}

