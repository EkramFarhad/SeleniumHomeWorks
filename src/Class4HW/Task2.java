package Class4HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

/*Hw2:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4
Note write down the logic in dynamic way i.e one change in if else condition can change ur selection*/

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
//        driver.findElement(By.cssSelector("input.cb1-element")).click();

     // how to get the text
        WebElement textPrint = driver.findElement(By.xpath("//label[text()='Option 2']"));
        String getText = textPrint.getText();
        System.out.println(getText+ " has been selected");

        List<WebElement> checkMarks = driver.findElements(By.cssSelector("input.cb1-element"));
        for (WebElement check : checkMarks) {
            String value = check.getAttribute("value");
            if (value.equals("Option-2")) {

                Thread.sleep(1000);
                check.click();

                Thread.sleep(5000);
                driver.close();
            }
        }


    }
}
