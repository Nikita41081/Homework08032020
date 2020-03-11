package browser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.util.concurrent.TimeUnit;

public class ChromeTesting {
    public static void main(String[] args) {
        String baseURL = "https://demo.nopcommerce.com/";

        //System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //WebDriver dr = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
        //dr.get(baseURL);
        //dr.quit();
    }
}
