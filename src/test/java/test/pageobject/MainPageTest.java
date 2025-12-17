package test.pageobject;

import test.constants.Data;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Автоматическая настройка драйвера
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get(Data.MAIN_URL);
        driver.manage().window().maximize();
    }

    @Test
    public void switchingToSectionBun() {
        // ваш тестовый код
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}