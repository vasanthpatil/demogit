import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'H-destination\']")).sendKeys("nyc");
		
		driver.findElement(By.xpath("//*[@id=\'H-destination\']")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//*[@id=\'H-destination\']")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		WebDriverWait d = new WebDriverWait(driver, 20);
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"522605\"]/div[2]/div/a")));
		
		driver.findElement(By.xpath("//*[@id=\"522605\"]/div[2]/div/a")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
