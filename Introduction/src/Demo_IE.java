import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create driver object
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\vasanth\\Documents\\Work\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());

	}

}
