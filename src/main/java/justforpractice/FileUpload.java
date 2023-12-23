package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement uploadAndDownloadPage = driver.findElement(By.id("uploadDownload_page"));
        uploadAndDownloadPage.click();

        WebElement chooseFileButton = driver.findElement(By.id("uploadFile"));

        chooseFileButton.sendKeys("/Users/svitlanahoshaw/Downloads/ksezni8i77yrfr6kmkac.webp");

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();
    }
}
