package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageLoadTimeOut {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //this works like a configuration
        //configuration is like setting different behavior

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        driver.get("https://dbank-qa.wedevx.co/bank/");
        System.out.println("END");
    }
}
