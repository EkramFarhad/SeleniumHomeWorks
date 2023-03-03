package Class4HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        //driver.manage().window().maximize();
        WebElement check = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("is the box checked ? = "+ check.isSelected());
        Thread.sleep(1000);
        check.click();
        System.out.println("Is the box checked ? = "+ check.isSelected());
        System.out.println("Is the box displayed ? = "+check.isDisplayed());
        System.out.println("Is the box Enabled ? = "+check.isEnabled());


        Thread.sleep(5000);
        driver.close();

    }
}
