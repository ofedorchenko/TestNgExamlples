package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Для запуска запустить файл
 */
public class ParametersAnnotationTest {

    @Parameters({"username", "password"})
    @Test()
    public void checkLogin(String username, String password) {
        System.out.println("Username is : " + username + ", Password is : " + password);
    }
}
