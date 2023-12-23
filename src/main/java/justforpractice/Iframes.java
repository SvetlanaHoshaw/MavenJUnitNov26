package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement iframeOption = driver.findElement(By.id("panel3bh-header"));
        iframeOption.click();

        Thread.sleep(2000);
        WebElement iframe_page = driver.findElement(By.id("iframes_page"));
        iframe_page.click();

        //To work with iframe, we need to locate iframe and switch to it
        WebElement iframe1 = driver.findElement(By.id("frame1"));

       // 3methods: by name or id, by order
        driver.switchTo().frame(iframe1); // switching by locating WebElement
        driver.switchTo().frame(0); // by order number
        driver.switchTo().frame("frame1"); // by name or id

        //After we call switchTo(), we can call element inside of iframe

        WebElement header1 = driver.findElement(By.xpath("//h1"));

        //In order to call element from  main/parent we need to switch to it
        driver.switchTo().parentFrame();

        WebElement alerts_page = driver.findElement(By.id("alerts_page"));
        alerts_page.click();

    driver.close();

    }
}
