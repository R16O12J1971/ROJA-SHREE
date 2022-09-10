package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://traininginchennai.in/selenium-training-in-chennai.html");
		WebElement findElement = driver.findElement(By.xpath("//h1[@title='Selenium Training in Chennai']"));
		String text = findElement.getText();
		System.out.println(text);
		WebElement findElement1 = driver.findElement(By.xpath("//p[contains(text(),'yourselves')]"));
		String text1 =findElement1.getText();
		System.out.println(text1);
		
	}

}
