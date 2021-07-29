package ru.yandex.devlada;

import org.testng.annotations.Test;

import java.awt.*;
public class NewTicketTest  extends TestInitQuit {
//Тест 3. Заполнение формы новой
    @Test(groups = "notRun")
   // @Test(groups = "run")
    public void newTicketTest() throws AWTException, InterruptedException {
        driver.get(ConfProperties.getProperty("page3"));
        //заполняем поле Тип
        newTicketPage.inputType(ConfProperties.getProperty("numType"));
        //заполняем поле Сервис
        newTicketPage.inputService(ConfProperties.getProperty("numSer"));
        //Заполняем поле Тема
        newTicketPage.inputTopic(ConfProperties.getProperty("topic"));
        //заполняем поле текст
        newTicketPage.inputText(ConfProperties.getProperty("textTicket"));
        //заполняем поле Приоритет
        newTicketPage.inputPriority(ConfProperties.getProperty("numPr"));
        Thread.sleep(1000);
        newTicketPage.clickSendBtn();
        Thread.sleep(1000);
    }

}
