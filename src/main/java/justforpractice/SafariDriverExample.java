package justforpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverExample {
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.amazon.com");
        driver.quit();
    }
}
