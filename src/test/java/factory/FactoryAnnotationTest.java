package factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryAnnotationTest {

    @Factory()
    @Test
    public Object[] getTestFactoryMethod() {
        Object[] factoryTest = new Object[2];
        factoryTest[0] = new FactoryOneTest();
        factoryTest[1] = new FactoryTwoTest();
        return factoryTest;
    }
}