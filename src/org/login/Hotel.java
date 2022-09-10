package org.login;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
        public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rojashree\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Roja1612");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("16@12@1971");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement dDnlocation = driver.findElement(By.id("location"));
		Select select = new Select(dDnlocation);
		select.selectByIndex(03);
	    WebElement dDnRooms = driver.findElement(By.id("room_nos"));
		Select select1 = new Select(dDnRooms);
		select1.selectByIndex(03);
		WebElement dDnAdult = driver.findElement(By.id("adult_room"));
		Select select2 = new Select(dDnAdult);
        select2.selectByIndex(03);
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement btnRadio = driver.findElement(By.id("radiobutton_4"));
        btnRadio.click();
        WebElement btnCont = driver.findElement(By.id("continue"));
        btnCont.click();
        WebElement txtFirstName = driver.findElement(By.id("first_name"));
        txtFirstName.sendKeys("Roja");
        WebElement txtLastName = driver.findElement(By.id("last_name"));
        txtLastName.sendKeys("Shree");
        WebElement txtAddress = driver.findElement(By.id("address"));
        txtAddress.sendKeys("Thoraipakkam");
        WebElement txtCcno = driver.findElement(By.id("cc_num"));
        txtCcno.sendKeys("2334578709876568");
        WebElement txtCctype = driver.findElement(By.id("cc_type"));
        Select select3 = new Select(txtCctype);
        select3.selectByIndex(2);
        WebElement txtCcexpmonth = driver.findElement(By.id("cc_exp_month"));
        Select select4 = new Select(txtCcexpmonth);
        select4.selectByIndex(4);
        WebElement txtCcexpyear = driver.findElement(By.id("cc_exp_year"));
        Select select5 = new Select(txtCcexpyear);
        select5.selectByIndex(10);
        WebElement txtCccvv = driver.findElement(By.id("cc_cvv"));
        txtCccvv.sendKeys("1612");
        WebElement txtBooknow = driver.findElement(By.id("book_now"));
        txtBooknow.click();
        Thread.sleep(7000);
        WebElement txtOrderno = driver.findElement(By.id("order_no"));
        
        String text = txtOrderno.getAttribute("value");
        System.out.println("order number is : " + text);
              
	}
}
        
 
        
        
        
        
        

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

