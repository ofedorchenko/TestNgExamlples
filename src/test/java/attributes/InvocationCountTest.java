package attributes;

import org.testng.annotations.Test;

public class InvocationCountTest {

    @Test(invocationCount = 3)
    public void invocationCountMethod() {
        System.out.println("После выполнения должно быть 3 записи в консоли");
    }
}