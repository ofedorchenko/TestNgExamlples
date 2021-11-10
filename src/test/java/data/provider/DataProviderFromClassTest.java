package data.provider;

import org.testng.annotations.Test;

public class DataProviderFromClassTest {

    @Test(dataProvider = "dataProviderName", dataProviderClass = DataProviderTest.class)
    public void dataProviderFromClass(String param){
        System.out.println("The parameter value is: " + param);
    }
}
