package testng;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestangExample {

    @Test
    public void testcase1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediffmail.com");
        driver.close();
    }
     @Test
    public void testcase2() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.rediffmail.com");
         driver.close();
     }
     @Test
    public void testcase3() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.rediffmail.com");
         driver.close();
     }
}
