package testng;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderExample {

    public static WebDriver driver;

    @DataProvider(name = "test_data")
    public Object[][] dataproviderfun() {
        return new Object[][]{{"Selenium", "Kolhapur"}, {"Java", "Pune"}};
    }


    @Parameters({"browser Name"})
    @BeforeMethod
    public void beforeMethod( String browserName){
        browserName.equals("chrome");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https//www.google.com");
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "test_data")
    public void verifyparameterization(){
        WebElement element = driver.findElement(By.id("input"));
        element.sendKeys("name"+""+"city");
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void Aftermethod(){
        driver.close();
    }

}
