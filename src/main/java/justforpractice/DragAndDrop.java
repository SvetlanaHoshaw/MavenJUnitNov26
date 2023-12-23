package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement widgets = driver.findElement(By.id("panel4bh-header"));
        widgets.click();

        Thread.sleep(3000);
        WebElement sliderPage = driver.findElement(By.id("slider_page"));
        sliderPage.click();

        WebElement slider = driver.findElement(By.xpath("//input"));

        Actions actions = new Actions(driver);
        //1. option to move sldiermoveByOffset takes 2 params - x and y
        actions.clickAndHold(slider).moveByOffset(250, 30).perform();


Thread.sleep(3000);
        //2.option to move slider
        //it will move from the point that was left
        actions.dragAndDropBy(slider, -250, 30).perform();
    }
}
