package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTwoClassTest {

    private WebDriver driver;
    private String urlGoogle = "https://www.google.com/";


    @BeforeTest
    public void annotationBeforeTest() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        driver = new FirefoxDriver();
    }

    /**
     * Метод запуска браузера Firefox и перехода на страницу https://www.google.com/
     */
    @Test
    public void startFirefoxGoToGooglePageTree() {
        driver.get(urlGoogle);
        System.out.println("Успешное выполнение метода - startFirefoxGoToGooglePageTree");
    }

    @AfterTest
    public void annotationAfterTest() {
        driver.quit();
    }
}