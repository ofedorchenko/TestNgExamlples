package before.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationBeforeWdSeveralTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void startFirefoxGoToGooglePageOne() {
        driver.get("https://www.google.com/");
    }

    @Test
    public void startFirefoxGoToGooglePageTwo() {
        driver.get("https://www.google.com/");
        driver.quit();
    }
}