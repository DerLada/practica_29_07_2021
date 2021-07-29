package ru.yandex.devlada;

import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
//НЕ РАБОТАЕТ
public class DeletePatternTest extends TestInitQuit {
    //Тест 7_05 Поиск с помощью использования шаблона. Проверка элемента работы с шаблонами кнопки «Удалить»
    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void deletePatternTest() throws AWTException, InterruptedException {
        driver.get(ConfProperties.getProperty("page7"));
       // searchPage.clickNameSearch();
        searchPage.inputNameSearch(ConfProperties.getProperty("name01"));
        Robot robot = new Robot();
        //нажать кнопку "Удаление"
        searchPage.DeletePrnBtn();
        //Щелкнуть по полю "Шаблон поиска"
        searchPage.clickNameSearch();
        Thread.sleep(1000);
        searchPage.clickNameSearch();
        //Нажать Esc
        robot.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(3000);
     }
}
