package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class KeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        //  driver.manage().window().fullscreen();

        WebElement forms = driver.findElement(By.id("panel2bh-header"));
        forms.click();
        Thread.sleep(3000);

        WebElement practiceForm_pageBtn = driver.findElement(By.id("practiceForm_page"));
        practiceForm_pageBtn.click();
        Thread.sleep(3000);

        WebElement firstNameBtn = driver.findElement(By.id("firstName"));

        Actions actions = new Actions(driver);

//if I want hit it, I have to do only 'sendKeys, if  I want to hold it, I have to add keyDown
//If it will be Windows, instead of COMMAND should be CONTROL
//here, we type Elon,  then we selected what we typed, we copied it and by clikcing TAB,
// we go to the next input and paste it
        actions.sendKeys(firstNameBtn, "Elon").keyDown(Keys.COMMAND).sendKeys("a")
                .sendKeys("c").keyUp(Keys.COMMAND).sendKeys(Keys.TAB).keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
    }
}
