package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathViaAttributes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co");

        Thread.sleep(2000);

        WebElement brokenPage = driver.findElement(By.xpath("//button[@id='broken_page']"));
        brokenPage.click();
        Thread.sleep(2000);


        WebElement brokenImage = driver.findElement(By.xpath("//img[@src='/image/gg.png']"));
        System.out.println(brokenImage.getText());
        String attributeValue = brokenImage.getAttribute("src");
        System.out.println(attributeValue);

        System.out.println(brokenImage.getAttribute("alt"));
    }
}
