package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNoOfLinksofgoogle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        List<WebElement> alllinks=    driver.findElements(By.tagName("a"));
        
       int count= alllinks.size();
       System.out.println(count);//print the count of all link
      
       for(int i=0;i<count;i++) {//it print all the links of chromebrowser
       WebElement firstlink=   alllinks.get(i);//getindex method
       String link=  firstlink.getAttribute("href");
        String text=firstlink.getText();
        System.out.println(link);//give the 0th index link
        System.out.println(text);//it give text msg of all links
        
        
       }
        
        
        
        
        
        
        
        
        
        
        /* List<WebElement> allLinks=    driver.findElements(By.tagName("a"));
        int count=   allLinks.size();        
     System.out.println(count);//to find out  total of links that you have given website
     for(int i=0;i<count;i++)//prints all the 0 to 24th index's link
    	 {
     WebElement Firstlink = allLinks.get(i);//to find out the 1 index link and get() it is the part of list of webELement
     String link1=Firstlink.getAttribute("href");//href is link common for all links and give the value of the attribute
     String text = Firstlink.getText();
     System.out.println(text);//return the text msg of the all the links

     System.out.println(link1);//to print all the links which are have text msg
     }*/
        
	}

}
