package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement windowOption = driver.findElement(By.id("panel3bh-header"));
        windowOption.click();
        Thread.sleep(2000);

        WebElement alerts_pageButton = driver.findElement(By.id("alerts_page"));
        alerts_pageButton.click();

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        Thread.sleep(2000);
        //switches to current alert
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        //accepts alert
        alert.accept();

        WebElement alertButtonWithDismissOption = driver.findElement(By.id("confirmButton"));
        alertButtonWithDismissOption.click();
        Thread.sleep(3000);

        //hit cancel button on the  alert
        alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);

        WebElement promptButton = driver.findElement(By.id("promptButton"));
        promptButton.click();
        Thread.sleep(3000);

        alert = driver.switchTo().alert();

        //enter text into alert
        alert.sendKeys("I'm proud of myself for studying hard and consistently");
        alert.accept();

    }
}
