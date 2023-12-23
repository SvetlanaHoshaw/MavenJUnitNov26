package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FluentWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");

        WebElement dynamicPropertiesButton = driver.findElement(By.id("dynamicProperties_page"));
        dynamicPropertiesButton.click();

        Wait<WebDriver> wait1 = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement enableButton = wait1.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        enableButton.click();
    }
}
