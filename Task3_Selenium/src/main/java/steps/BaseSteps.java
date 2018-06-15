package steps;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by 1 on 14.06.2018.
 */
public class BaseSteps {

    public static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void startTest(){
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.sberbank.ru/ru/person");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver .manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterMethod(){
        driver .quit();
    }

}