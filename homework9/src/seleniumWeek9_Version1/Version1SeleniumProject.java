package seleniumWeek9_Version1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
This programme will open all below links in all four browsers
 */
public class Version1SeleniumProject {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        project("https://demo.nopcommerce.com/");
        project("https://www.barclays.co.uk/");
        project("https://www.wcht.org.uk/");
        project("https://www.harrow.gov.uk/");
        project("https://www.x-cart.com/");

    }
    public static void project (String baseUrl) throws InterruptedException {

        // Chrome Browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(1000);
        driver.quit();
        //FireFox
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(1000);
        driver.quit();
        // Edge
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(1000);
        driver.quit();
        //Internet Explorer
        System.setProperty("webdriver.ie.driver","drivers/internetexplorer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(1000);
        driver.quit();
            }
    }
