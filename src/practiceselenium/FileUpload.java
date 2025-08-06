package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://grotechminds.com/registration/");
        driver.manage().window().maximize();
      WebElement fileupload=  driver.findElement(By.id("file"));
      fileupload.sendKeys("C:\\Users\\Dell Latitude 3400\\Downloads\\ARATI-D RESUME.pdf");
	}

}
