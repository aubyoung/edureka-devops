package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://172.17.0.2/index.php");
		
		System.out.println("Title of current page is: " + driver.getTitle());
		driver.findElement(By.linkText("About Us")).click();
		
		Boolean result = driver.getPageSource().contains("Lorem Ipsum Dipsum is simply dummy text");
		
		System.out.println("Result of value found: " + result);
				
	}

}
