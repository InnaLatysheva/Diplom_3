package test.tests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import pageobject.MainPage;

import static org.junit.Assert.assertTrue;

public class MainPageTest extends BaseTest {

    private MainPage mainPage;

    @Before
    public void setUp() {
        // Вызываем setUp родительского класса чтобы инициализировать driver
        super.setUp();

        // Теперь driver не будет null
        driver.get(MainPage.URL_PAGE);
        mainPage = new MainPage(driver);
    }

    @Test
    @DisplayName("Переход к разделу Начинки")
    @Description("Проверка возможности перехода к разделу Начинки на главной странице")
    public void switchingToSectionTopping() {
        mainPage.clickSectionTopping();
        assertTrue("Раздел Начинки не стал активным", mainPage.isSectionActive("Начинки"));
    }

    @Test
    @DisplayName("Переход к разделу Соусы")
    @Description("Проверка возможности перехода к разделу Соусы на главной странице")
    public void switchingToSectionSauce() {
        mainPage.clickSectionTopping();
        mainPage.clickSectionSauce();
        assertTrue("Раздел Соусы не стал активным", mainPage.isSectionActive("Соусы"));
    }

    @Test
    @DisplayName("Переход к разделу Булки")
    @Description("Проверка возможности перехода к разделу Булки на главной странице")
    public void switchingToSectionBun() {
        mainPage.clickSectionTopping();
        mainPage.clickSectionBun();
        assertTrue("Раздел Булки не стал активным", mainPage.isSectionActive("Булки"));
    }

    @After
    public void tearDown() {
        // Вызываем tearDown родительского класса
        super.tearDown();
    }
}