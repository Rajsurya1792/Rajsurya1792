package Library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
      public  WebDriver driver;
      
      public void chromeBrowser() {
    	  WebDriverManager.chromiumdriver().setup();
    	  driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.get("https://www.amazon.in/");
      }
      public void chromeBrowser1() {
    	  ChromeOptions opt=new ChromeOptions();
    	  opt.addArguments("--desable-notifications");
    	  WebDriverManager.chromiumdriver().setup();
    	  driver=new ChromeDriver();
    	 // driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.get("https://www.facebook.com/");
      }
      public void edgeBrowser() {
    	  WebDriverManager.edgedriver().setup();
    	  driver=new EdgeDriver();
    	//  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.get("https://www.facebook.com/");
      }
      public void firefoxBrowser() {
    	  WebDriverManager.firefoxdriver().setup();
    	  driver=new FirefoxDriver();
    	//  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.get("https://www.facebook.com/");
      }
}
