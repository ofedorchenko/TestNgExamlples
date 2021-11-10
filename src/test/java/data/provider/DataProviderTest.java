package data.provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "dataProviderName", parallel = true)
    public Object[][] dataMethod(){
        return new Object[][] {{"one"}, {"two"}};
    }

    @Test(dataProvider = "dataProviderName")
    public void testMethod(String param){
        System.out.println("The parameter value is: " + param);
    }
}
