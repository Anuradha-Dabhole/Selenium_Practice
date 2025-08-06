package practiceselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		
	    driver.findElement(By.name("q")).sendKeys("India",Keys.ENTER);
	}

}
