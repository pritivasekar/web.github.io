import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.*;


public class webdriver {
    public static void main(String[] args) 
    {
    	// objects and variables instantiation
    System.setProperty("webdriver.gecko.driver","C:\\Users\\Sai\\Downloads\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	String appUrl="http://localhost:8080/WebDemo/";
	
	// launch the firefox browser and open the application url
	driver.get(appUrl);
	
	// maximize the browser window
	driver.manage().window().maximize();
	
	
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

    }
	
}
