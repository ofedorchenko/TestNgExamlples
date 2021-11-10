package attributes;

import org.testng.annotations.Test;

public class ExpectedExceptionsTest {

    /**
     * Успешное выполнение тестового метода, так как ожидание - ArithmeticException
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionsSuccessfulMethod() {
        int i = 1 / 0;
        System.out.println("Результат деления на ноль :"+ i);
    }

    /**
     * Ошибка выполнения - выбрасывает исключение ArithmeticException.
     */
    @Test
    public void expectedExceptionsFaildMethod() {
        int i = 1 / 0;
        System.out.println("Результат деления на ноль :"+ i);
    }
}
