package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("rose@gmail.com");
		String attribute = findElement.getAttribute("value");
        System.out.println(attribute);	
        
        String attribute1 = findElement.getAttribute("name");
        System.out.println(attribute1);	
        
}
}