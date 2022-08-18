package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
    public static WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
    @Test(groups = "smoke")
    public void Test2(){
        SoftAssert softAssert= new SoftAssert();
        driver.get("https://www.rediff.com");
        softAssert.assertEquals(driver.getTitle(),"rediffmail","title should be Rediffmail");
        softAssert.assertEquals(driver.findElement(By.xpath("//p[Text='Username']")).getText(),"Username","title should be [Username]");
        softAssert.assertEquals(driver.findElement(By.xpath("//p[Text='Password']")).getText(),"Password","title should be [Password]");
        softAssert.assertAll();
    }
    @AfterMethod
    public void AfterMethod(){
        driver.close();
    }
}
