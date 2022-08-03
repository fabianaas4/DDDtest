package com.vicentry.lab.initializer;







import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Initializer{
	
	 public static WebElement getElementByname(String key){
		 try{
	WebElement element=wd.findElement(By.name(LocaterProp.getProperty(key)));
		 return element;
		 }catch (Exception e){
			 System.out.println("Alert: Unable to find element by name - " +key +" - "+e.getMessage());
		 }
		 return null;
		 
	 }
		 public static WebElement getElementById(String key){
			 try{
		WebElement element=wd.findElement(By.id(LocaterProp.getProperty(key)));
			 return element;
			 }catch (Exception e){
				 System.out.println("Alert: Unable to find element by id - " +key +" - "+e.getMessage());
			 }
			 return null;
			 
		 }
		 public static WebElement getElementByXpath(String key){
			 try{
		WebElement element=wd.findElement(By.xpath(LocaterProp.getProperty(key)));
			 return element;
			 }catch (Exception e){
				 System.out.println("Alert: Unable to find element by Xpath - " +key +" - "+e.getMessage());
			 }
			 return null;
		 }
		 
		 public static WebElement getElementByLinkText(String key){
			 try{
		WebElement element=wd.findElement(By.linkText(LocaterProp.getProperty(key)));
			 return element;
			 }catch (Exception e){
				 System.out.println("Alert: Unable to find element by Link Text - " +key +" - "+e.getMessage());
			 }
			 return null;
			 
			 
			 
		 }
		 public static WebElement getElementByPartialLinkText(String key){
			 try{
		WebElement element=wd.findElement(By.partialLinkText(LocaterProp.getProperty(key)));
			 return element;
			 }catch (Exception e){
				 System.out.println("Alert: Unable to find element by partial Link Text - " +key +" - "+e.getMessage());
			 }
			 return null;
			 
		 }
		 
		 public static WebElement getElementByClassName(String key){
			 try{
		WebElement element=wd.findElement(By.className(LocaterProp.getProperty(key)));
			 return element;
			 }catch (Exception e){
				 System.out.println("Alert: Unable to find element by class name - " +key +" - "+e.getMessage());
			 }
			 return null;
			 
		 }
		 public static WebElement getElementByCSS(String key){
			 try{
		WebElement element=wd.findElement(By.cssSelector(LocaterProp.getProperty(key)));
			 return element;
			 }catch (Exception e){
				 System.out.println("Alert: Unable to find element by css locater - " +key +" - "+e.getMessage());
			 }
			 
			 return null;
			 
		 }
			 
			 public static WebElement getElementBytagName(String key){
				 try{
			WebElement element=wd.findElement(By.tagName(LocaterProp.getProperty(key)));
				 return element;
				 }catch (Exception e){
					 System.out.println("Alert: Unable to find element by tag name - " +key +" - "+e.getMessage());
				 }
				 return null;
		 
		 
		 } 
			 
			 //findElements
			 
			 public static List<WebElement> getElementsByname(String key){
				 try{
		 List<WebElement> element=wd.findElements(By.name(LocaterProp.getProperty(key)));
				 return element;
				 }catch (Exception e){
					 System.out.println("Alert: Unable to find element by name - " +key +" - "+e.getMessage());
				 }
				 return null;
				 
			 }
				 public static List<WebElement> getElementsById(String key){
					 try{
						 List<WebElement> element=wd.findElements(By.id(LocaterProp.getProperty(key)));
					 return element;
					 }catch (Exception e){
						 System.out.println("Alert: Unable to find element by id - " +key +" - "+e.getMessage());
					 }
					 return null;
					 
				 }
				 public static List<WebElement> getElementsByXpath(String key){
					 try{
						 List<WebElement> element=wd.findElements(By.xpath(LocaterProp.getProperty(key)));
					 return element;
					 }catch (Exception e){
						 System.out.println("Alert: Unable to find element by Xpath - " +key +" - "+e.getMessage());
					 }
					 return null;
				 }
				 
				 public static List<WebElement> getElementsByLinkText(String key){
					 try{
						 List<WebElement> element=wd.findElements(By.linkText(LocaterProp.getProperty(key)));
					 return element;
					 }catch (Exception e){
						 System.out.println("Alert: Unable to find element by Link Text - " +key +" - "+e.getMessage());
					 }
					 return null;
					 
					 
					 
				 }
				 public static List<WebElement> getElementsByPartialLinkText(String key){
					 try{
						 List<WebElement> element=wd.findElements(By.partialLinkText(LocaterProp.getProperty(key)));
					 return element;
					 }catch (Exception e){
						 System.out.println("Alert: Unable to find element by partial Link Text - " +key +" - "+e.getMessage());
					 }
					 return null;
					 
				 }
				 
				 public static List<WebElement> getElementsByClassName(String key){
					 try{
						 List<WebElement> element=wd.findElements(By.className(LocaterProp.getProperty(key)));
					 return element;
					 }catch (Exception e){
						 System.out.println("Alert: Unable to find element by class name - " +key +" - "+e.getMessage());
					 }
					 return null;
					 
				 }
				 public static List<WebElement> getElementsByCSS(String key){
					 try{
						 List<WebElement> element=wd.findElements(By.cssSelector(LocaterProp.getProperty(key)));
					 return element;
					 }catch (Exception e){
						 System.out.println("Alert: Unable to find element by css selector - " +key +" - "+e.getMessage());
					 }
					 
					 return null;
					 
				 }
					 
					 public static List<WebElement> getElementsBytagName(String key){
						 try{
							 List<WebElement> element=wd.findElements(By.tagName(LocaterProp.getProperty(key)));
						 return element;
						 }catch (Exception e){
							 System.out.println("Alert: Unable to find element by tag name - " +key +" - "+e.getMessage());
						 }
						 return null;
				 
				 
				 } 
		 

}
