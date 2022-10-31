package stepdefination;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.cucumber.java.en.*;
import pageobject.PageObject;

public class RegisterStepdefination {
	WebDriver driver;
    PageObject dp;

@Given("Launch browser")
public void launch_browser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Automation files\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	dp = new PageObject(driver);
	}

@And("Open URL")
public void open_url() {
	driver.get("https://demo.guru99.com/test/newtours/");

}

@And("User click on Register")
public void user_click_on_register(){
	dp.regiester.click();
	
 
}

@When("User Enter details info {string} then {string} then {string} then {string}")
public void user_enter_details_info_then_then_then(String firstname, String lastname, String code, String email) {

	dp.firstName.sendKeys("firstname");
	
	dp.lastName.sendKeys("lastname");
	
	dp.address.sendKeys("code");
	
	dp.email.sendKeys("email");
}


@And("User Enter details info")
public void user_enter_details_info() throws IOException, InterruptedException {
	
	dp.firstName.sendKeys("Yogesh");
	
	dp.lastName.sendKeys("Nagpure");
	
	dp.phone.sendKeys("1234567890");
	
	dp.email.sendKeys("yog@gmail.com");
	
	dp.address.sendKeys("New Yerkheda");
	
	dp.city.sendKeys("Nagpur");
	
	dp.state.sendKeys("MH");
	
	dp.code.sendKeys("441001");
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;			//scrolling page down		
	
	js.executeScript("window.scrollBy(0,250)", "");
	
	
	WebElement ABC = dp.country;								//selecting element by select method
	
	Select XYZ = new Select(ABC);
	
	XYZ.selectByValue("INDIA");
	
	List<WebElement> hello = XYZ.getOptions();					//listing all element by list method
	
	for(int i =0; i<hello.size();i++)
	{
		System.out.println(hello.get(i).getText());
	}
	
	Thread.sleep(1000);
	
//	dp.country.sendKeys("INDIA");
	
	dp.userName.sendKeys("yogeshnagpure");
	
	dp.password.sendKeys("Yogesh@123");
	
	dp.confirmpassword.sendKeys("Yogesh@123");
	
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);							//capturing screenshot
	
    Files.copy(f, new File("C:\\Users\\HP\\Documents\\Selenium ScreenShot\\MercuryProject.jpg"));
	

}

@And("User click on submit button")
public void user_click_on_submit_button() {
	
	JavascriptExecutor js = (JavascriptExecutor)driver;											//clicking by javascript method
	
	WebElement btn = dp.submitbtn;
	
	js.executeScript("arguments[0].click();", btn);
	
	
//	dp.submitbtn.click();
	

}

@And("User get thank you message")
public void user_get_thank_you_message() {
	
	if(driver.getPageSource().contains("Thank you for registering.")) {
		System.out.println("Message Found Successfully");
	}else 
	{
		System.out.println("Message not found");
	}
	
}

@Then("Close the browser")
public void close_the_browser() {
	
	driver.close();
   
}

}
