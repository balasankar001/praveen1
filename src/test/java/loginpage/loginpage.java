package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	public static void main (String [] args ) {
WebDriverManager.chromedriver().setup();
WebDriver driver=(WebDriver) new ChromeDriver();
driver.get("https://www.supermart.ae/");
		
WebElement Tologin =driver.findElement(By.xpath("//div[@id='header-user-btn']"));
Tologin.click();
		
WebElement useremail=driver.findElement(By.xpath("(//input[@name='email'])[4]"));
useremail.sendKeys("bmanian058@gmail.com");
		
WebElement password =driver.findElement(By.xpath("(//input[@name='password'])[3]"));
password.click();
password.sendKeys("balasankar");
		
WebElement loginbtm =driver.findElement(By.xpath("(//button[@class='btn login-by-email'])"));
loginbtm.click();
	}
}
