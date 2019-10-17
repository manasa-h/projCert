import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class TestPHPSel {
 
        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver(chromeOptions);
 
                driver.get("http://3.86.102.56:32768/");
 
                Thread.sleep(1000);

		driver.findElement(By.linkText("About Us")).click();
 
                if (driver.getPageSource().contains("Lorem Ipsum Dipsum")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }
                driver.quit();
        }
}

