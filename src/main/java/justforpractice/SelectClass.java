package justforpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.manage().window().fullscreen();

        driver.get("http://demo-project.wedevx.co");

        WebElement panel2bh = driver.findElement(By.id("panel2bh-header"));
        panel2bh.click();

        Thread.sleep(4000);
        WebElement practiceForm_page = driver.findElement(By.id("practiceForm_page"));
        practiceForm_page.click();


        WebElement stateDropDown = driver.findElement(By.id("react-select-6-input"));
        Select stateDropDownSelect = new Select(stateDropDown);

        //adding all options to the list
        List<WebElement> allStateOptions = stateDropDownSelect.getOptions();

        for (WebElement state : allStateOptions) {
            System.out.println(state.getText());
        }
//will select 5th option from the list of options
        stateDropDownSelect.selectByIndex(4);
        Thread.sleep(3000);

        //value in the attribute
        stateDropDownSelect.selectByValue("New York");

        //by text
        stateDropDownSelect.selectByVisibleText("Texas");

    }
}
