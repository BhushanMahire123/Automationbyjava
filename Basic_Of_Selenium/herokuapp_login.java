package Basic_Of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class herokuapp_login {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		// Maximise the Browser
		
		driver.manage().window().maximize();
     
     	//Open Url
		driver.get("https://the-internet.herokuapp.com/login");
		
		// wait a Second
		Thread.sleep(1000);
		
		// Enter the User name into the Username Field
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		
		// Enter the Password into the Password Field
		  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		   // Click on Log in Button
	      driver.findElement(By.cssSelector("button[type='submit']")).click();
	      
	      // Verify Log in Succesful message 
	   
	     boolean isloginsuccesful=driver.findElement(By.id("content")).isDisplayed();
	   
	     if ( isloginsuccesful) {
	    	 System.out.println("login Succesful");
	     }
	     else {
	    	 System.out.println("login unSuccesful");
	     }
	     
	     //Log Out Browser
	     driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
	     
	   //  Quit Browser
	    
	       driver.quit();
		
	}

}
