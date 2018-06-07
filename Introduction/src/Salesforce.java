import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test");
		
		driver.findElement(By.name("pw")).sendKeys("fail");
		
		driver.findElement(By.id("Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		System.out.println("fail");
		
		driver.close();
	}

}
