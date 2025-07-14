package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_google_gmail_linktext {

	public static void main(String[] args) 
	{
		ChromeDriver  driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
         WebElement s1=driver.findElement(By.linkText("Gmail"));
         s1.click();
	}

}
