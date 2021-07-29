package ru.yandex.devlada;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class EmptyNamePatternTest extends TestInitQuit {
    //Тест 7.2 Поиск с помощью использования шаблона. Проверка элементов работы с шаблонами при пустом значении поля «шаблон поиска»
    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void emptyNamePatternTest() throws AWTException, InterruptedException {
        driver.get(ConfProperties.getProperty("page7"));
        Robot robot = new Robot();
        //запросить значение находящееся в поле "Шаблон поиска"
        String namePrn = searchPage.getFieldNamePrn("Profile_Search");
        //Проверить, что это значение является нулевым
        Assert.assertEquals("", namePrn);
        //Нажать на кнопку "Выбор"
        searchPage.choicePrnBtn();
        Thread.sleep(1500);
        //Нажать на кнопку "Удалить"
        searchPage.DeletePrnBtn();
        //Щелкнуть по полю "Шаблон поиска"
        searchPage.clickNameSearch();
        //Визуально проверить, что ничего не изменилось
        Thread.sleep(1000);
        searchPage.clickNameSearch();
        //выйти из режима выбора шаблон через нажатие клавиши Esc
        robot.keyPress(KeyEvent.VK_ESCAPE);
        //Нажать на кнопку "Поиск"
        searchPage.searchPrnBtn();
        Thread.sleep(3000);
    }
}
