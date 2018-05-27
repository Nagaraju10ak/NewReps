import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.modifier.SynchronizationState;

public class COPA {

	public void search1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Selenium",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/h3/a")).click();	
		}
	
	public void search2() {
		System.out.println("caling this method was successfull");
	}
	
	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,300);
		driver.get("https://pssguicmmb.airservices.svcs.entsvcs.com");
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:/Users/katiyar/Desktop/credentials.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFCell Cell = sh.getRow(1).getCell(0);
			XSSFCell Cell1 = sh.getRow(1).getCell(1);
			XSSFCell Cell2 = sh.getRow(1).getCell(2);
			XSSFCell Cell3 = sh.getRow(1).getCell(3);
			String cell1=Cell1.toString();
			String cell=Cell.toString();
			String cell2=Cell.toString();
			String cell3=Cell.toString();
			System.out.println(Cell);
			System.out.println(Cell1);
			driver.findElement(By.xpath(".//*[@id='myForm']/table/tbody/tr[1]/td/input")).sendKeys(cell);
			driver.findElement(By.xpath(".//*[@id='myForm']/table/tbody/tr[2]/td/input")).sendKeys(cell1);
			driver.findElement(By.xpath(".//*[@id='myForm']/table/tbody/tr[3]/td/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/ul/li[3]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[3]/div[1]/div/div[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='select_value_label_5']/span[1]/div")).sendKeys(cell2);
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='select_9']")).sendKeys(cell3);
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='dialogContent_4']/div/div[2]/div[2]/button[2]")).click();
			
	}
	
	public void login1() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Users/katiyar/Desktop/credentials.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFCell Cell = sh.getRow(1).getCell(0);
			XSSFCell Cell1 = sh.getRow(1).getCell(1);
			System.out.println(Cell);
			System.out.println(Cell1);
			
		}
		
		
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\katiyar\\geckodriver.exe");
		COPA search = new COPA();
		//search.search1();
		//search.search2();
		search.login();
		

	}

}
