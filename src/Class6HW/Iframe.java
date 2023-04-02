package Class6HW;

/*
* HW2
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page
*/

import com.google.common.eventbus.SubscriberExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1.Open the Chrome browser and navigate to
        driver.get("https://the-internet.herokuapp.com/iframe");
        // 2.Switch to the iframe on the page
        driver.switchTo().frame(0);
        // wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(1000);
        WebElement text = driver.findElement(By.xpath("//*[@id=\"tinymce\"]"));
        // 3.Clear the existing text in the  editor inside the iframe
        text.clear();

        // 4.Enter the text "Hello World!" in the editor inside the iframe
        text.sendKeys("Hello World!");
        System.out.println("Is the Hello World displayed ? " + text.isDisplayed());
        // 5.Switch back to the main page
        driver.switchTo().defaultContent();

        Thread.sleep(10000);
        driver.close();

    }
}
