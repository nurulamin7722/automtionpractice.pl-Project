package driverPackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

    WebDriver driver = null;

    @BeforeSuite
    public void setUp() {

        String browser = System.getProperty("browser", "chrome");
        if (browser.contains("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();

        } else if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            
            driver = new ChromeDriver(options);
 

        } else if (browser.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }


        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setDriver(driver);

    }

    @AfterSuite
    public void tearDown() {
        PageDriver.getCurrentDriver().quit();
    }

}
