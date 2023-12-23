package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co");

        Thread.sleep(5000);

        WebElement linkButto = driver.findElement(By.id("links_page"));

        linkButto.click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Created")).click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Moved")).click();

        Thread.sleep(2000);

        WebElement notFoundLink = driver.findElement(By.partialLinkText("Not"));
        notFoundLink.click();

        Thread.sleep(2000);

        WebElement badRequest = driver.findElement(By.partialLinkText("Request"));
        badRequest.click();
    }
}
