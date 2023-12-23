package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumPractice {

    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co");

        WebElement webTbleOption = driver.findElement(By.id("webTables_page"));
        webTbleOption.click();

        Thread.sleep(2000);

        WebElement firstColumnHeader = driver.findElement(By.xpath("//table//th[2]/span"));
        assertEquals("Dessert (100g serving)", firstColumnHeader.getText());

        WebElement secondColumnHeader = driver.findElement(By.xpath("//table//th[3]/span"));
        assertEquals("Calories\nsorted ascending", secondColumnHeader.getText());

        WebElement firstRowDessertName = driver.findElement(By.xpath("//tbody/tr[1]/th"));
        assertEquals("Frozen yoghurt", firstRowDessertName.getText());

        WebElement firstRowDesertCalories = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
        assertEquals("159", firstRowDesertCalories.getText());

        driver.quit();
    }
}
