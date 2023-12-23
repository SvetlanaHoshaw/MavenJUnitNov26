package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://dbank-qa.wedevx.co/bank/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/bank/signup']")).click();
        driver.navigate().back();

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.findElement(By.id("firstName")).sendKeys("Elon Mask");
        Thread.sleep(2000);

        driver.navigate().to("https://dbank-qa.wedevx.co/bank/");

        driver.navigate().refresh();
        driver.quit();
    }
}
