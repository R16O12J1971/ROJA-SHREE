package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		// Locate the table
		
		WebElement table = driver.findElement(By.id("customers"));
		
		//From the table- Multiple rows
        
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//iterate the row
		
		
		System.out.println("==============TABLE FORMAT==================");
		
		for(int i=0;i<rows.size();i++) {
			WebElement individualRow = rows.get(i);
			
		   //from the row - multiple columns
			
			List<WebElement> columns = individualRow.findElements(By.tagName("td"));
			
			for(int j=0;j<columns.size();j++) {
				
				WebElement individualcolumn = columns.get(j);
				String text = individualcolumn.getText();
				

				System.out.print(text + "                  ");
				
				}
			 System.out.println();
		}
		System.out.println("===================ALTERNATE DATA========================");
		for(int i=0;i<rows.size();i=i+2) {
			WebElement individualRow = rows.get(i);
			
		   //from the row - multiple columns
			
			List<WebElement> columns = individualRow.findElements(By.tagName("td"));
			
			for(int j=0;j<columns.size();j=j+2) {
				
				WebElement individualcolumn = columns.get(j);
				String text = individualcolumn.getText();
				System.out.println(text);
			}
		}
		
		System.out.println("===========================INVERTED FORM OF THE TABLE================================");
		for(int i=rows.size()-1;i>=0;i--) {
			WebElement individualRow = rows.get(i);
			
		   //from the row - multiple columns
			
			List<WebElement> columns = individualRow.findElements(By.tagName("td"));
			
			for(int j=columns.size()-1;j>=0;j--) {
				
				WebElement individualcolumn = columns.get(j);
				String text = individualcolumn.getText();
				

				System.out.print(text + "                  ");
				
				}
			 System.out.println();
		}
		
	}
}

		
		
	
		