package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathWithText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co");

        Thread.sleep(2000);

        WebElement buttonPage = driver.findElement(By.xpath("//button[@id='buttons_page']"));
        buttonPage.click();

        Thread.sleep(2000);

        WebElement doubleClickMeButton = driver.findElement(By.xpath("//button[text()='Dounle Click Me']"));
        doubleClickMeButton.click();

        Thread.sleep(2000);
    }

}
