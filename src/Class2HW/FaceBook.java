package Class2HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Ekra");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Farha");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("ekramfarhad@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password_step_input")).sendKeys("12345678kilo");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_month")).sendKeys("Jan");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_day")).sendKeys("01");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        Thread.sleep(1000);
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.quit();



    }
}
