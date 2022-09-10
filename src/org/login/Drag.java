package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    Thread.sleep(3000);
	    WebElement s = driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[1]"));
	    WebElement d = driver.findElement(By.id("bank"));
		Thread.sleep(3000);
	    Actions actions = new Actions(driver);
	    actions.dragAndDrop(s,d).perform();
	    								
	}

}


