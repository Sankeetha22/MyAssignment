package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Frame {

	public static void main(String[] args) {

		// Setting up the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// launching the desired application URL
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Switching to the corresponding frame using frame id to access the web element text box
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Test Leaf - Sankeetha");
		
		// Switching to the corresponding frame using frame id to check the web element check box
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		
		//added to ensure the whether focus is in Main page
		
		if (driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).isDisplayed()) {
			System.out.println("In Main Page");
		}
		

		//Selecting the Value form the drop down
		driver.switchTo().frame("frame2");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		select.selectByValue("babycat");
		
		driver.close();
	}
		
}
