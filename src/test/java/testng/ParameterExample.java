package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.naming.Name;

public class ParameterExample {

    public static WebDriver driver;

    @Parameters({"browser Name"})
    @BeforeMethod
    public void beforeMethod( String browserName){
        browserName.equals("chrome");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https//www.google.com");
        driver.manage().window().maximize();
    }
      @Test
     public void verifyparameterization(){
        String name = "Selenium";
        String city = "Kolhapur";
        WebElement element = driver.findElement(By.id("input"));
        element.sendKeys("name"+""+"city");
        element.sendKeys(Keys.ENTER);
     }
     @AfterMethod
     public void Aftermethod(){
        driver.close();
     }
}
