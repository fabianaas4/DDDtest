package com.vicentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vicentry.lab.utils.ReportOptimizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	public static ExtentReports reports;
	public static ExtentTest log;
	public static boolean isReport=true;
	
	
public static WebDriver wd=null;
	/**
	 * *@author fabiana
	 * @created_data 18th July 2022
	 * @purpose to initialize the environment variables
	 */
	public static Properties envProp = null;

	/**
	 * *@author fabiana
	 * @created_data 18th July 2022
	 * @purpose to initialize the locater variables
	 * 
	 */

	public static Properties LocaterProp = null;



	/**
	 * *@author fabiana
	 * @throws IOException
	 * @created_data 18th July 2022
	 * @purpose to initialize env.properties and locater.properties files
	 */

	public static void initialize() throws FileNotFoundException, IOException {
		if(isReport){
			ReportOptimizer.optimizeReport();
		
		
		reports=new ExtentReports("C:/Users/fabia/workspace/H1_DDDTest/report/index.html");
isReport=false;
		}
		envProp = new Properties();
		envProp.load(new FileInputStream(new File("src/test/resources/com/vicentry/lab/config/env.properties")));

		LocaterProp = new Properties();
		LocaterProp.load(new FileInputStream(new File("src/test/resources/com/vicentry/lab/config/locater.properties")));
		if(wd==null){
		if (envProp.get("BROWSER").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		} else if (envProp.get("BROWSER").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
		} else if (envProp.get("BROWSER").equals("ie")) {
			//WebDriverManager.iedriver().setup();
			//wd = new InternetExplorerDriver();
		}
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
}
}