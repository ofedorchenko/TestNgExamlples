package groups.before.after;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * TODO
 * Для запуска методов класса необходимо запустить testng-chrome.xml и testng-firefox.xml
 */
public class AnnotationBeforeAfterGroupsTest {

    private WebDriver chromeDriver;
    private WebDriver firefoxDriver;
    private String urlGoogle = "https://www.google.com/";


    @BeforeGroups("chrome")
    public void annotationBeforeGroupsChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // Setting system properties of FirefoxDriver
        chromeDriver = new ChromeDriver();
    }

    @BeforeGroups("firefox")
    public void annotationBeforeGroupsFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        firefoxDriver = new FirefoxDriver();
    }

    @Test(groups = {"chrome"})
    public void beforeAfterGroupsByChrome() {
        chromeDriver.get(urlGoogle);
        System.out.println("Тестовый метод, запущенный в группе тестов для браузера Chrome");
    }

    @Test(groups = {"firefox"})
    public void beforeAfterGroupsByFirefox() {
        firefoxDriver.get(urlGoogle);
        System.out.println("Тестовый метод, запущенный в группе тестов для браузера Firefox");
    }

    @AfterGroups("chrome")
    public void annotationAfterGroupsChrome() {
        chromeDriver.quit();
        System.out.println("Успешное выполнение метода - annotationAfterGroupsChrome после группы тестов для браузера Chrome");
    }

    @AfterGroups("firefox")
    public void annotationAfterGroupsFirefox() {
        firefoxDriver.quit();
        System.out.println("Успешное выполнение метода - annotationAfterGroupsFirefox после группы тестов для браузера Firefox");
    }
}