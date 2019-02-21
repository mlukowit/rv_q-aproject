package newtestpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

 public class accessDropDown {
 public static void main(String[] args) { 
		System.setProperty("webdriver.firefox","C:\\projects\qandaproject\firefoxdriver.exe");
	    String baseURL = "https://creditcards.com";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);

		Select menu__item = new Select(driver.findElement(By.name("Card Category")));
		menu__item_submenu.selectBymenu__link("Best Credit Cards")Click();

	//Close the browser.
driver.close();	
 }
}
