package Class2HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
* HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser*/

public class FindOutForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Ekram");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Farhad");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys("2926 S Meadows pl");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Sacramento");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("95822");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9099292000");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("12345678");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("EkramFarhad");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("111222333444");
        Thread.sleep(1000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("111222333444");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        driver.quit();




    }
}
