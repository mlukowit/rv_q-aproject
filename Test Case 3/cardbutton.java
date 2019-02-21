package cardbutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkURL {
public static void main(String[] args) {

// Create a new instance of the Firefox driver
WebDriver driver = new FirefoxDriver();
// Navigate to URL
driver.get("https://www.creditcards.com");
// Maximize the window.
driver.manage().window().maximize();

//Click on Explore Best Credit Cards button

driver.findElement(By.xpath("//div[@class='homePage__ctas-button']/div")).click();

//Close the browser.
driver.close();
}
}
