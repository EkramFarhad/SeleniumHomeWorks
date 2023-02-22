package Task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1. launch the browser
 * 2. navigate to amazon web site
 * 3. print out the title and the url in the console
 * 4. close the browser
 */

public class LaunchBrowsers {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.amazon.com/");

        String url = webDriver.getCurrentUrl();

        System.out.println("The URL of the page is: " + url);

        String title = webDriver.getTitle();
        System.out.println(" The title of the page is: " + title);
        webDriver.close();


    }
}
