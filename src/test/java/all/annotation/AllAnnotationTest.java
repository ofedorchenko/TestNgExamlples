package all.annotation;

import org.testng.Assert;
import org.testng.annotations.*;

public class AllAnnotationTest {

    @Test(groups="group1")
    public void test1() {
        System.out.println("test1 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group1")
    public void test11() {
        System.out.println("test11 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group2")
    public void test2(){
        System.out.println("test2 from group2");
        Assert.assertTrue(true);
    }

    @Test
    public void test3(){
        System.out.println("test3 without group");
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }

    // Действителен только для group1, а именно test1 и test11
    @BeforeGroups(groups="group1")
    public void beforeGroups(){
        System.out.println("beforeGroups");
    }

    // Действителен только для group1, а именно test1 и test11
    @AfterGroups(groups="group1")
    public void afterGroups(){
        System.out.println("afterGroups");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
}