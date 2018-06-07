import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'initialView\']/footer/ul/li[1]/a")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String>ids = driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		
		String parentid = it.next();
		
		String childid = it.next();
		
		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		
	}

}
