package practiceselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {
	 static void Brokenlinks(String link) throws IOException
	{
		 try {
		URL u1=new URL(link);
	HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
	if(h1.getResponseCode()==200 || h1.getResponseCode()==201)
	{
		System.out.println("Link is valid " +link+" " + h1.getResponseMessage());
		System.out.println("Here is the respone msg: "+ h1.getResponseMessage());
		System.out.println("Here is the status code: "+ h1.getResponseCode());

	}
	else {
		System.out.println("Link is not valid "+link+" " + h1.getResponseMessage());
		System.out.println("Here is the respone msg: "+ h1.getResponseMessage());
		System.out.println("Here is the status code: "+ h1.getResponseCode());


	}
	}
		 catch(NullPointerException n1)
		 {
			 System.out.println("Link is null,I was handled");
		 }
		 catch(MalformedURLException n1)
		 {
			 System.out.println("Link is null,I was handled");
		 }
	}

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        List<WebElement> alllinks=    driver.findElements(By.tagName("a"));
        
       int count= alllinks.size();
       System.out.println(count);//print the count of all link
      
       for(int i=0;i<count;i++) {//it print all the links of chromebrowser
       WebElement firstlink=   alllinks.get(i);//getindex method
       String link=  firstlink.getAttribute("href");
        String text=firstlink.getText();
        System.out.println(link);//give the 0th index link
        //System.out.println(text);//it give text msg of all links
        Brokenlinks(link);
	}

}
}