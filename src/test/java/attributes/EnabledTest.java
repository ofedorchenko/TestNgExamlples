package attributes;

import org.testng.annotations.Test;

public class EnabledTest {

    @Test(priority = 1, enabled = false)
    public void priorityOneMethod(){
        System.out.println("Метод с прио 1");
    }

    @Test(priority = 2)
    public void priorityTwoMethod(){
        System.out.println("Метод с прио 2");
    }

}
