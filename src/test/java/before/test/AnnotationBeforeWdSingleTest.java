package before.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AnnotationBeforeWdSingleTest {

    /**
     * Метод запуска браузера Firefox и перехода на страницу https://www.google.com/
     */
    @Test
    public void startFirefoxGoToGooglePage() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
