package practiceselenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_title_id {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
             driver.get("https://www.google.com");//launch google
             String title=driver.getTitle();
             System.out.println(driver.getTitle());//display the title
             String window=driver.getWindowHandle();
             System.out.println(window);//give the browser id
             Set<String> window1=driver.getWindowHandles();
             System.out.println(window1);//give the id of parent tab and child tab


            // driver.quit();//direct close the window 
	}

}
