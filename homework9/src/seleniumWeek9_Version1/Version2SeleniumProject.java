package seleniumWeek9_Version1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Version2SeleniumProject {

    // declared driver variable as static
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // called all parameterised methods which passes string browserName
        browserSelection("chrome");
        browserSelection("firefox");
        browserSelection("edge");
        browserSelection("ie");
    }
// created a  parametrerised method
    public static void browserSelection(String browser) throws InterruptedException {
    // using if-else if statement it checkes the string passed from main as a parameter and executes
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            Thread.sleep(2000);
            driver.get("https://www.barclays.co.uk/");
            Thread.sleep(2000);
            driver.get("https://www.wcht.org.uk/");
            Thread.sleep(2000);
            driver.get("https://www.harrow.gov.uk/");
            Thread.sleep(2000);
            driver.get("https://www.x-cart.com/");
            Thread.sleep(2000);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            Thread.sleep(2000);
            driver.get("https://www.barclays.co.uk/");
            Thread.sleep(2000);
            driver.get("https://www.wcht.org.uk/");
            Thread.sleep(2000);
            driver.get("https://www.harrow.gov.uk/");
            Thread.sleep(2000);
            driver.get("https://www.x-cart.com/");
            Thread.sleep(2000);
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            Thread.sleep(2000);
            driver.get("https://www.barclays.co.uk/");
            Thread.sleep(2000);
            driver.get("https://www.wcht.org.uk/");
            Thread.sleep(2000);
            driver.get("https://www.harrow.gov.uk/");
            Thread.sleep(2000);
            driver.get("https://www.x-cart.com/");
            Thread.sleep(2000);
        }
        driver.quit();
    }
}


