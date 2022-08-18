package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test(priority = 1)
    public void MethodC(){
        System.out.println("method C");
    }
    @Test(priority = 3)
    public void MethodB(){
        System.out.println("method B ");
    }
    @Test(dependsOnMethods = "MethodD")
    public void MethodA(){
        System.out.println("method A");
    }
    @Test(priority = 2)
    public void MethodD(){
        System.out.println("method D");
        Assert.assertFalse(true);
    }
}
