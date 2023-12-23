package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co");

        WebElement currentAdderssTxtBtn = driver.findElement(By.name("currentAddress"));
        currentAdderssTxtBtn.sendKeys("123 Main st.");

        WebElement permanentaddress = driver.findElement(By.name("permanentAddress"));
        permanentaddress.sendKeys("123 Space X");
        Thread.sleep(3000);

        driver.quit();
    }
}
