import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Suresh\\Chrome Driver\\chromedriver_win32 (6)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	}

}
