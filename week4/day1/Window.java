package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Window {

	public static void main(String[] args) 
	{

		// Setting up the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// launching the desired application URL
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Click and Confirm new Window Opens
				driver.findElement(By.xpath(
						"//h5[text()='Click and Confirm new Window Opens']/following-sibling::button/span[text()='Open']"))
						.click();

				Set<String> windowHandles = driver.getWindowHandles();
				List<String> windowHandle = new ArrayList<String>(windowHandles);
				
			driver.switchTo().window(windowHandle.get(1));
			String name = driver.getTitle();
			System.out.println(name);
			
			if (name.equalsIgnoreCase("Dashboard")) {
				System.out.println("New window '" + name + "' is opened");
			} else {
				System.out.println("New window '" + name + "' is not opened");
			}

			driver.close();
			 driver.switchTo().window(windowHandle.get(0));
			 String parent1 = driver.getTitle();
			 System.out.println("New window '" + parent1 + "' is opened");
			
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
				driver.switchTo().window(windowHandle.get(0));
				// Open Multiple
				
				driver.findElement(By.xpath(
						"//h5[text()='Find the number of opened tabs']/following-sibling::button/span[text()='Open Multiple']"))
						.click();

				Set<String> windowHandles2 = driver.getWindowHandles();
				List<String> windowHandle2 = new ArrayList<String>(windowHandles2);
				//to count how many open window
				System.out.println("Number of window opend is" + windowHandle2.size());
			
				// Close all windows except Primary
				 driver.findElement(By.xpath(
							"//h5[text()='Close all windows except Primary']/following-sibling::button/span[text()='Close Windows']"))
							.click();

					Set<String> windowHandles1 = driver.getWindowHandles();
					List<String> windowHandle1 = new ArrayList<String>(windowHandles1);
					//to count how many open window
					System.out.println(windowHandle.size());
					for (String count : windowHandle1) {
						if (count.equalsIgnoreCase(parent1)) {
							continue;
							
						}
						else {
							driver.switchTo().window(count);
							String pagename = driver.getTitle();
							System.out.println("New window '" + pagename + "' is opened");
							driver.close();
						}}
		
	}}

		

