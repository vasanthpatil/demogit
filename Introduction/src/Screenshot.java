import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(src,new File("D://screenshot.png"));
	}

}
