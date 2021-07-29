package ru.yandex.devlada;

import org.testng.annotations.Test;
import java.awt.*;
//НЕ РАБОТАЕТ
public class SearchPatternTest extends TestInitQuit {
//Тест 7_04 Поиск с помощью использования шаблона. Проверка элемента работы с шаблонами кнопки «Поиск»
    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void searchPatternTest() throws AWTException, InterruptedException {
        driver.get(ConfProperties.getProperty("page7"));
        searchPage.clickNameSearch();
        searchPage.inputNameSearch(ConfProperties.getProperty("name01"));
        //нажать на кнопку поиск
        searchPage.searchPrnBtn();
        //задержка для визуального сравнения и оценки
        Thread.sleep(5000);

    }
}
