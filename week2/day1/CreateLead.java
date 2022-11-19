package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	WebElement findElement = driver.findElement(By.id("username"));
	findElement.sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test2");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("keetha");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Localfirst");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Locallast");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dep");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Email@gmail.com");
	
WebElement findElement1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

	Select dd = new Select (findElement1);
	dd.selectByVisibleText("Alaska");

	
	
	driver.findElement(By.className("smallSubmit")).click();
	//driver.close();
	
	}}
			
