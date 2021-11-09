package attributes;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    public void priorityOneMethod(){
        System.out.println("Метод с прио 1");
    }

    @Test(priority = 2)
    public void priorityTwoMethod(){
        System.out.println("Метод с прио 2");
    }

    @Test(priority = 3)
    public void priorityTreeMethod(){
        System.out.println("Метод с прио 3");
    }
}
