package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().fullscreen();

        WebElement windowOption = driver.findElement(By.id("panel3bh-header"));
        windowOption.click();
        Thread.sleep(2000);
        WebElement broweserWindows_pageButton = driver.findElement(By.id("browserWindows_page"));
        broweserWindows_pageButton.click();

        //getting the id of current tab, every time when I run it, it will be different
        //but for current session it will be the same
        String uniqueIdOfTheCurrentTab = driver.getWindowHandle();
        System.out.println(uniqueIdOfTheCurrentTab);

        //In order to click on the link which navigates to different tab,
        //we need to
        // 1. click on the link/button which navigates to diff tab, this will ONLY open
        //the tab, but it will not navigate to it
        //2. then we have to switch() method, but we need id of opened tab,
        //so we create a Set of all opened tabs and retrive desired tab
        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        Set<String> allOpenTabsIds = driver.getWindowHandles();

        //now we need access Set, we can do it through Loop
//in this loop we compare the Id of first tab with all Ids of the tabs
        // and navigate to different tab
        for (String tabId : allOpenTabsIds) {
            if (!tabId.equals(uniqueIdOfTheCurrentTab)) {
                driver.switchTo().window(tabId);
                break;
            }
        }
        WebElement header1 = driver.findElement(By.xpath("//h1"));
        System.out.println(header1.getText());
    }
}
