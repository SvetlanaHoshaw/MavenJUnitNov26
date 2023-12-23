package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement radioButtonPage = driver.findElement(By.id("radioButton_page"));
        radioButtonPage.click();

        WebElement impressiveRadiobuton = driver.findElement(By.xpath("//input[@value='Impressive']"));
        impressiveRadiobuton.click();

        //AssertTrue - fore real test
        System.out.println(impressiveRadiobuton.isSelected());
        System.out.println(impressiveRadiobuton.isSelected());

        WebElement yesRadiobuton = driver.findElement(By.xpath("//input[@value='Yes']"));
        System.out.println(yesRadiobuton.isSelected());

        WebElement noRadiobuton = driver.findElement(By.xpath("//input[@value='No']"));
        System.out.println(yesRadiobuton.isEnabled());

    }
}
