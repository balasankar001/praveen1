package supermart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginsteps {
	WebDriver driver;
	
	@Given("The user should be in supermart application page")
	public void the_user_should_be_in_supermart_application_page()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.supermart.ae/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("The user has to click the signin btn")
	public void the_user_has_to_click_the_signin_btn()  {
		//WebElement Tologin =driver.findElement(By.xpath("//div[@id='header-user-btn']"));
		WebElement Tologin=driver.findElement(By.xpath("//*[@id=\"header-user-btn\"]"));
				
		Tologin.click();
		
	}

	@When("The user has to fill the valid email&paasword the click login btn")
	public void the_user_has_to_fill_the_valid_email_paasword_the_click_login_btn() {
		
		WebElement useremail=driver.findElement(By.xpath("(//input[@name='email'])[4]"));
		useremail.sendKeys("bmanian058@gmail.com");
		
		WebElement password =driver.findElement(By.xpath("(//input[@name='password'])[3]"));
		password.click();
		password.sendKeys("balasankar");
		
		WebElement loginbtm =driver.findElement(By.xpath("(//button[@class='btn login-by-email'])"));
		loginbtm.click();
	}

	@Then("The user should be login in the supermart application page")
	public void the_user_should_be_login_in_the_supermart_application_page() {
	    System.out.println("logged in");
	
	
	}
	
	

}
