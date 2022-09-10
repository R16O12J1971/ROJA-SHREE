package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main (String[]args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.greenstechnologys.com/");
	    WebElement lnkCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(lnkCourse).perform();
	    //WebElement lnkBigData = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
	    //lnkBigData.click();
	    WebElement lnkOracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
	    actions.moveToElement(lnkOracle).perform();
	}

}
