package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();



        JavascriptExecutor js = (JavascriptExecutor) driver;

        //in js window.location='url' -> driver.get('url')
        //using JavascriptExecutor to navigate to the website
        js.executeScript("window.location='https://www.etsy.com'");

       //using JavascriptExecutor to scroll
        Thread.sleep(10000);
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1000)");

        //using JavascriptExecutor to scroll into
        WebElement helpCenterLink = driver.findElement(By.xpath("//span[contains(text(), 'Help Center')]"));
        js.executeScript("arguments[0].scrollIntoView()", helpCenterLink);

        Thread.sleep(2000);
        //using JavascriptExecutor to change color of the button (when you refresh, it will be deleted)
        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
        js.executeScript("arguments[0].scrollIntoView()", signInButton);

        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid green')", signInButton);
        //using JavascriptExecutor to click
        js.executeScript("arguments[0].click()", signInButton);


    }
}
