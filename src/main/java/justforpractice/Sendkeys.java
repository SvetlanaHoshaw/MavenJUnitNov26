package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co/");


        WebElement fullNameTextBox = driver.findElement(By.id("name"));

        fullNameTextBox.sendKeys("Ilon Mask");
        Thread.sleep(5000);

        WebElement emailTxtBox = driver.findElement(By.id("email"));
        emailTxtBox.sendKeys("elon@spacex.com");

        WebElement currentAddressTxtBox = driver.findElement(By.id("currentAddress"));
        currentAddressTxtBox.sendKeys("address current");

        WebElement permanentAddressTxtBox = driver.findElement(By.id("permanentAddress"));
        permanentAddressTxtBox.sendKeys("123 SpaceX ave");

        WebElement submitBtn = driver.findElement(By.className("MuiButton-containedPrimary"));
        driver.quit();
    }
}
