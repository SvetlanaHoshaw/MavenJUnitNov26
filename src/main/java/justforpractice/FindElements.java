package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co");

        WebElement webTablesButton = driver.findElement(By.id("webTables_page"));
        webTablesButton.click();
        Thread.sleep(2000);

        List<WebElement> allThElements = driver.findElements(By.xpath("//table//th"));
        System.out.println(allThElements.size());

        for (WebElement th : allThElements) {
            System.out.println(th.getText());
        }

        Thread.sleep(2000);
    }
}
