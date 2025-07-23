package practiceselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_move_control_parent_to_child {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("shoe" + Keys.ENTER);
       
        WebElement e2=driver.findElement(By.xpath(" (//a[@class='a-link-normal s-no-outline'])[1]"));
        e2.click();
        Thread.sleep(3000);
      
        Set<String> id= driver.getWindowHandles();
        Iterator<String> i1=id.iterator();
        String parentid = i1.next();
        String Childid = i1.next();
        System.out.println(parentid);
        System.out.println(Childid);

        

        
	}

}
