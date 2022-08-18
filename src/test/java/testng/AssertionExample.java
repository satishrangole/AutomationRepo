package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionExample {

    public static WebDriver driver;
     @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     }
     @Test(groups = "smoke")
     public void testcase1(){
         driver.get("https://www.facebook.com");
         Assert.assertEquals(driver.getTitle(),"facebook","title should be facebook");
         System.out.println("My name is Satish");
     }
     @AfterMethod
     public void afterMethod(){
         driver.close();
     }
}

