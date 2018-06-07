import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://jqueryui.com/droppable/");		
		driver.manage().window().maximize();		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));		
		Actions a = new Actions(driver);		
		WebElement x =driver.findElement(By.id("draggable"));		
		WebElement y =driver.findElement(By.id("droppable"));	
		
		a.dragAndDrop(x, y).build().perform();
		
	}

}
