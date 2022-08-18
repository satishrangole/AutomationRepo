package testng;

import org.testng.annotations.Test;

public class NullPointerException {

    @Test(expectedExceptions ={NullPointerException.class,ArithmeticException.class})
    public void methodD(){
        System.out.println("methodD");
        System.out.println(20/0);
        System.out.println("Satish");
    }
    @Test
    public void methodC(){
        System.out.println("methodC");

    }
    @Test
    public void methodB(){
        System.out.println("methodB");
    }
    @Test
    public void methodA(){
        System.out.println("methodA");
    }
}
