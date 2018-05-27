import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\katiyar\\geckodriver.exe");
//		 System.setProperty("webdriver.firefox.marionette","C:\Users\katiyar\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=g6xfWqLBA-KG8Qe0oLLQCg");
WebElement abc = driver.findElement(By.id("gs_lc0"));
abc.sendKeys("Selenium",Keys.ENTER);
driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div[1]/div/div/h3/a")).click();

	}

}
