package Class8HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*please do this HW
it is needed to be done before class on saturday
i request everyone to Attempt it as this will help u alot in working with tables and calenders.

1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath*/
public class DynamicTable2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        userName.clear();
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
        password.clear();
        password.sendKeys("Hum@nhrm123");
        //login button click
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        //PIM tab click
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();

        List<WebElement> colum = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td[6]"));

        /*for (int i = 0; i < colum.size(); i++) {
            String text = colum.get(i).getText();
            if (text.equalsIgnoreCase("Legend")) {
                //System.out.println(i + text);
                List<WebElement> row = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[6]"));
                driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[" + (i + 1) + "]/td[1]")).click();
            }

        }*/

        for (WebElement column : colum) {
            String text = column.getText();
            if (text.equalsIgnoreCase("Legend")) {
                List<WebElement> row = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr[" + (colum.indexOf(column) + 1) + "]/td[6]"));
                driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[" + (colum.indexOf(column) + 1) + "]/td[1]")).click();
            }
        }





        Thread.sleep(90000);
        driver.close();

    }
}
