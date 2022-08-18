package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderMethod {


    public static WebDriver driver;

    @DataProvider(name = "test_data")
    public Object[][] dataproviderfun() throws IOException  {
        Object[][] arrobj =getExcelSheetData("C:\\Users\\Admin\\Documents\\Custom Office Templates\\DataProviderSheet.xlsx","Data_sheet");
        return arrobj;
    }

     public Object[][] getExcelSheetData(String fileName, String SheetName) throws IOException {
         String[][] data = null;
         FileInputStream fileInputStream = new FileInputStream(fileName);

         return new Object[0][];
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
