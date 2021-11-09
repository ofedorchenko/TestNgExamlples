package attributes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class DependsOnMethodsAndAlwaysRunTest {

    @Test
    public void methodWithError(){
        int a, b;
        a = 1;
        b = 2;
        assertTrue(a > b);
        System.out.println("");
    }

    @Test(dependsOnMethods = "methodWithError")
    public void dependentMethod(){
        System.out.println("Зависимый метод - зависит от успешного прохождения methodWithError");
    }

    @Test(dependsOnMethods = "methodWithError", alwaysRun = true)
    public void dependentMethodWithAlwaysRun(){
        System.out.println("Зависимый метод - зависит от успешного прохождения methodWithError, но должен біть запущен, так как задан еще и атрибут 'alwaysRun = true'");
    }
}