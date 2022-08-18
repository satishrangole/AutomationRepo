package testng;

import org.testng.annotations.*;

public class AnnotationExample {

       @BeforeSuite
       public void BeforeSuite(){
        System.out.println("before Suite");
        }
       @BeforeTest
        public void BeforeTest(){
            System.out.println("before Test");
        }
        @BeforeClass
        public void BeforeClass(){
        System.out.println("before class");
        }

        @BeforeMethod
         public void BeforeMethod(){
            System.out.println("before method");
        }

        @Test
        public void test1(){
            System.out.println("test case1");
        }

        @Test
        public void test2(){
            System.out.println("test case2");
        }
        @AfterMethod
       public void AfterMethod(){
          System.out.println("after method");
        }
        @AfterClass
        public void AfterClass(){
        System.out.println("after class");
       }
         @AfterTest
        public void AfterTest(){
        System.out.println("After Test");
        }
        @AfterSuite
        public void AfterSuite(){
        System.out.println("After Suite");
        }

}
