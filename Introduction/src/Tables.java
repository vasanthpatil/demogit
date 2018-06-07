import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\Documents\\Work\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20113/rr-vs-rcb-53rd-match-indian-premier-league-2018");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\'innings_1\']/div[1]"));
		
		int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++)
		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();			
			
			int valueinteger = Integer.parseInt(value);
			
			sum = sum+valueinteger;		
			
		}		
		
		String withextras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		int WE = Integer.parseInt(withextras);
		
		int mytotal = sum+WE;
		
		System.out.println(mytotal);
		
		String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		int webtotal = Integer.parseInt(total);
		
		if(mytotal==webtotal){
			System.out.println("Test pass");
		}
		
		

	}

}
