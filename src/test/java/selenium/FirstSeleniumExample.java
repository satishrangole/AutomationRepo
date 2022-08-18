package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediffmail.com");
        driver.close();
    }
}
