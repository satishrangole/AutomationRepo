package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupClassExample {

    @Test(groups = "smoke")
    public void methodC() {
        System.out.println("methodC");
        Assert.assertFalse(true);
    }

    @Test(dependsOnMethods = "methodC", alwaysRun = true)
    public void methodB() {
        System.out.println("methodB");
    }

    @Test(dependsOnMethods = "methodB")
    public void methodA() {
        System.out.println("methodA");
    }
}
