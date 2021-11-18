import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDemo {
	public static WebDriver driver;

	public static void main(String[]  args) throws MalformedURLException, InterruptedException{

 		String URL = "http://localhost:8080/WebDemo/";
 		String Node = "http://10.90.0.139:4444/wd/hub";
 		DesiredCapabilities cap = DesiredCapabilities.firefox();

 		driver = new RemoteWebDriver(new URL(Node), cap);

 		driver.navigate().to(URL);
 	// 1. Title Verification 
 		
 	    String expectedTitle = "Rajasthan Tourism";

 	    

 	// fetch the title of the web page and save it into a string variable

 	    String actualTitle = driver.getTitle();

 	    

 	// compare the expected title of the page with the actual title of the page and print the result

 	    if (expectedTitle.equals(actualTitle))

 	    {

 	           System.out.println("Verification Successful - The correct title is displayed on the web page.");

 	    }

 	   else

 	    {

 	           System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

 	    }



 	// 2. Navigation 

 	   driver.navigate().to("http://localhost:8080/WebDemo/about.html");
 	   if(driver.getTitle().equals("Rajasthan Tourism About"))
 	  	 System.out.println("Naviageted to page Successfully");
 	   else 
 	  	 System.out.println("Failed");

 	   //3. Image Testing
 	   driver.findElement(By.cssSelector("img[title=\"jaipurImg\"]")).click();				
 	   if (driver.getTitle().equals("Rajasthan Tourism About")) {							
 	       System.out.println("We are back at About");					
 	   } else {			
 	       System.out.println("We are NOT in About");					
 	   }		  

 	// 4. Locating HTML Elements by ID

 	   
 	   driver.navigate().to("http://localhost:8080/WebDemo/contact.html");
 	   
 	   WebElement ele1 = driver.findElement(By.name("name"));
 	    ele1.click();
 	   ele1.sendKeys("Sainath Utturkar");
 	   System.out.println("Test Submitted Successfully");

 	   


 	    

 	/*	//5. Verifying database connection
 	    
 	    String url = "jdbc:mysql://localhost:3306/stqa";
 	    Connection con= null;
 	    try{
 	  	  Class.forName("com.mysql.jdbc.Driver");
 	  	  con=DriverManager.getConnection(url,"stqa","abcd");
 	  	  
 	  	  
 	        System.out.println("Connected Successfully");
 	    }catch(Exception e)
 	    {
 	  	  System.out.println("Connected Failed");
 	  	  		
 	    }*/
 	    

 	    //6. Close the web browser 
 	    
 	   driver.close();

 	System.out.println("Test script executed successfully.");

 	   

 	// terminate the program

 	    System.exit(0);
 		driver.quit();
 	}		
}
