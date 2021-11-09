package before.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationBeforeTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Выполнение @BeforeTest выполняется перед методами с аннотацией - @Test");
    }

    @Test
    public void methodTest1() {
        System.out.println("Первый тестовый метод с аннотацией @Test");
    }

    @Test
    public void methodTest2() {
        System.out.println("Второй тестовый метод с аннотацией @Test");
    }
}