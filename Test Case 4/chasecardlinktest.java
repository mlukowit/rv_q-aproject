import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class CardLinkClass {				
    		
    public static void main(String[] args) {									
        String baseUrl = "https://creditcards.com";					
        System.setProperty("webdriver.chrome.driver","c:\\projects\qandaproject\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.linkText("Chase Sapphire Preferred&#174; Card")).click();					
        System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();			
    }		

}			
