package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumIntro1 {
    public static void main(String[] args) {
        //WebDriverManager is a class that has diiferent browser driver
        //Selenium can't communicate directly with browers, there is a executable file,which called Drivers
        //Java send command to Driver, Driver send commands to browsers
        //every project that executes tests on Chrome Browesrs, shoule set up at least one time

        WebDriverManager.chromedriver().setup();

        //        WebDriver os Selenium Interface
        //that represents all browser drivers.
        //implementations are ChromeDriver(), SafaaruDriver; IEDriver(), FirefoxDriver()
        //new CrhomeDriver will open a browser

        WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new SafariDriver();
        driver.get("https://www.wedevx.co/");

        driver.quit();
    }
}
