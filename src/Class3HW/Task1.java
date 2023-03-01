package Class3HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
use xpath to complete this

goto http://practice.syntaxtechs.net/basic-first-form-demo.php
enter the message in the text box
click on show message
Enter value of a (edited)
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL*/

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Hello, How are you today?");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("50");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        String getTotal = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        System.out.println("The total value is = "+getTotal);

//

//        driver.close();
    }
}
