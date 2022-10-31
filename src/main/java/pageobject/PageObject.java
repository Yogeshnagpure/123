package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    public WebDriver driver;
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);}
	
	@FindBy(xpath="//a[text()='REGISTER']")
	public WebElement regiester;
	
	@FindBy(name="firstName")
	public WebElement firstName;
	
	@FindBy(name="lastName")
	public WebElement lastName;
	
	@FindBy(name="phone")
	public WebElement phone;
	
	@FindBy(xpath="//input[@id='userName']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='address1']")
	public WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	public WebElement city;

	@FindBy(xpath="//input[@name='state']")
	public WebElement state;
	
	@FindBy(xpath="//input[@name='postalCode']")
	public WebElement code;
	
	@FindBy(xpath="//select[@name='country']")
	public WebElement country;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement confirmpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	public WebElement submitbtn;
	
}
