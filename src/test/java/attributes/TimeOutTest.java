package attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TimeOutTest {

    /**
     * Метод запуска браузера Firefox и перехода на страницу https://www.google.com/
     * Установлено ограничение на прохождение. Показывает ошибку ThreadTimeoutException, так как
     * не хватает 500 миллисекунд на прохождение сценария.
     */
    @Test(timeOut = 500)
    public void timeOutExceptionMethod() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
