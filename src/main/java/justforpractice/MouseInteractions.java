package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class MouseInteractions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  driver.manage().window().fullscreen();

        driver.get("http://demo-project.wedevx.co");

        WebElement buttonPage = driver.findElement(By.id("buttons_page"));
        buttonPage.click();

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        //double click
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();

        //right click
        WebElement rightClickbutton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickbutton).perform();

        //click using Actions  class
        WebElement clickMeButton = driver.findElement(By.id("TiIXO"));
        actions.click(clickMeButton);
    }
}
