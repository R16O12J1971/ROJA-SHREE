package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement mutiSelectDropDown = driver.findElement(By.id("Skills"));
		Select s = new Select(mutiSelectDropDown);
		
		//to print all the even options from the dropdown
		
		System.out.println("================EVEN OPTIONS====================");
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i=i+2) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
			
		//to print all the odd options from the dropdown
		System.out.println("===================ODD OPTIONS======================");
		List<WebElement> options1 = s.getOptions();
			for(int i=1;i<options1.size();i=i+2) {
				WebElement webElement = options.get(i);
				String text = webElement.getText();
				System.out.println(text);
				
			}
				
				//to print middle option from the dropdown
		
				int size = options.size();
                System.out.println(size/2);
                
                WebElement webElement = options.get(39);
			    String text = webElement.getText();
			    System.out.println("====================MIDDLE OPTION=======================");
				System.out.println(text);
				
                }
		}
	


