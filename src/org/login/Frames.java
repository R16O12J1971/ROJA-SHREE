package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//switch the control to the frame
		

		//driver.switchTo().frame(0);
		//driver.switchTo().frame("login_page");
		//WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));

		//driver.switchTo().frame(frame);
		
		//WebElement customerId = driver.findElement(By.xpath("//input[@type='text']"));
		//customerId.sendKeys("12345");
		

}
}