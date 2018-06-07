import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:\\facebook.com");
		
		/*driver.findElement(By.id("email")).sendKeys("test");
		
		driver.findElement(By.name("pass")).sendKeys("fail");
		
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("username");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("username");
		
		driver.close();

	}

}
