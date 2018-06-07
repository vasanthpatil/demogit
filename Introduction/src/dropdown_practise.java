import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
			
		//Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
		//s.selectByValue("2");
		
	/*	driver.findElement(By.xpath("//input[@value='Departure City']")).click();
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();*/
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.close();
						

	}

}
