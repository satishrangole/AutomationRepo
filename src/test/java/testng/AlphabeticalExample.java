package testng;

import org.testng.annotations.*;

public class AlphabeticalExample {

    @Test
    public void MethodB(){
        System.out.println("method B");
    }
     @Test
    public void MethodC(){
        System.out.println("method C");
    }
    @Test
    public void MethodA(){
        System.out.println("method A");
    }
}
