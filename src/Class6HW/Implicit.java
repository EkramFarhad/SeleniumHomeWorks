package Class6HW;


/*HW
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page (edited)
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Implicit {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait confirmText = new WebDriverWait(driver, 20);
        WebElement helloText = confirmText.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
        System.out.println("Hello World has been confirmed ? " + helloText.getText());
        System.out.println("Hello World has been confirmed ? " + helloText.isDisplayed());


        Thread.sleep(30000);
        driver.close();

    }
}
