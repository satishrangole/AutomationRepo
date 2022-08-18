package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTestngProgram {

    @Test
    public void testcase1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        driver.close();
    }
     @Test
    public void testcase2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.close();
    }

}
