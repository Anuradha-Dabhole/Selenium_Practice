package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    //WebElement e1= driver.findElement(By.cssSelector("#APjFqb"));#idval
    //WebElement e2= driver.findElement(By.cssSelector(".gLFyf"));.CNMVAL
    
   //WebElement e3= driver.findElement(By.cssSelector("[name='q']"));[AN='AV']
   // WebElement e4= driver.findElement(By.cssSelector("textarea[name='q']"));//TN[AN='AV']
    //WebElement e5= driver.findElement(By.cssSelector("textarea.gLFyf"));//TN.CNMVAL
    WebElement e6= driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));//TN.CNMVAL[AN^='AV']
    WebElement e7= driver.findElement(By.cssSelector(input[id^="twotabsearchtextbox"]));//^TN[AN^='AV']


   e7.sendKeys("shoe"+Keys.ENTER);
    e7.click();

	}

}
