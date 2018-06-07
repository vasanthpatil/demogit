import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");		
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		
		String Text = (String) js.executeScript(script);
		
		System.out.println(Text);
		
	while(!Text.equalsIgnoreCase("BENGALURU AIRPRT"))
			{
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);	
		Text = (String) js.executeScript(script);
		System.out.println(Text);
			}
}
}
