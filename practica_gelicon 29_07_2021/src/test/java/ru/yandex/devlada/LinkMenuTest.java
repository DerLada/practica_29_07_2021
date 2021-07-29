package ru.yandex.devlada;

import org.testng.annotations.Test;

public class LinkMenuTest extends TestInitQuit {
//Тест 2. Проверка ссылок в пунктах меню Запросы
    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void linkMenuTest() throws InterruptedException {
        driver.get(ConfProperties.getProperty("page2"));

        //переход по ссылке Новая заявка (1-ый переход)
        linkFunction.linkMenu("html/body/div[2]/ul[1]/li[1]/ul/li[1]/a");
        Thread.sleep(1000);
        //переход по ссылке Мои заявки (2-й переход)
        linkFunction.linkMenu("html/body/div[2]/ul[1]/li[1]/ul/li[2]/a");
        Thread.sleep(1000);
        //переход по ссылке Заявки компании(3-й переход)
        linkFunction.linkMenu("html/body/div[2]/ul[1]/li[1]/ul/li[2]/a");
        Thread.sleep(1000);
        //переход по ссылке Поиск(4-й переход)
        linkFunction.linkMenu("html/body/div[2]/ul[1]/li[1]/ul/li[2]/a");
        Thread.sleep(1000);
    }
}
