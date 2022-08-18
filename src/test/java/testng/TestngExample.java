package testng;


import org.testng.annotations.*;

public class TestngExample {


        @Test(priority = 2)
        public void MethodB(){
            System.out.println("method B");
        }

        @Test
        public void MethodC(){
            System.out.println("method C");
        }

        @Test(priority = 1)
        public void MethodA(){
            System.out.println("method A");
        }
}
