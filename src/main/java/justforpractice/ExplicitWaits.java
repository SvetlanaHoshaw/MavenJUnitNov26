package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaits {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");

        WebElement dynamicPropertiesButton = driver.findElement(By.id("dynamicProperties_page"));
        dynamicPropertiesButton.click();

        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement enableAfter5Button =
                wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

        enableAfter5Button.click();

        WebElement visibleAfterButton =
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));
        visibleAfterButton.click();
        driver.quit();

        wait.until(ExpectedConditions.attributeContains(By.id("colorChange"), "style", "color: red;"));

        WebElement redButton = driver.findElement(By.id("colorChange"));


    }
}
