package ru.yandex.devlada;

import org.testng.annotations.Test;
//Тест 5_01. Проверка ссылок на странице «Мои заявки»
public class MyTicketTest extends TestInitQuit {
//Тест 5_01. Проверка ссылок на странице «Мои заявки»
    @Test(groups = "notRun")
    //@Test(groups = "run")
     public void myTicketTest() throws InterruptedException {
        driver.get(ConfProperties.getProperty("page5_01"));
        //переход по ссылке Все
        linkFunction.linkTicket(ConfProperties.getProperty("el1MyTic"));
        Thread.sleep(500);
        //переход по ссылке Открытые
        linkFunction.linkTicket(ConfProperties.getProperty("el2MyTic"));
        Thread.sleep(500);
        //переход по ссылке Закрытые
        linkFunction.linkTicket(ConfProperties.getProperty("el3MyTic"));
        Thread.sleep(2000);

    }
}
