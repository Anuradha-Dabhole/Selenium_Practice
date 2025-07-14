package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("anuradha@1234");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
        //conductor.findElement(By.name("login")).sendKeys(Keys.ENTER);



	}

}
