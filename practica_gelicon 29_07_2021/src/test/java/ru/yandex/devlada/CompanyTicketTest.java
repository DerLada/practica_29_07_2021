package ru.yandex.devlada;

import org.testng.annotations.Test;

public class CompanyTicketTest extends TestInitQuit {
    //Тест 5_02. Проверка ссылок на странице «Заявки компании»
    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void companyTicketTest() throws InterruptedException {
        driver.get(ConfProperties.getProperty("page5_02"));
        //переход по ссылке Все
        linkFunction.linkTicket(ConfProperties.getProperty("el1ComTic"));
        Thread.sleep(500);
        //переход по ссылке Открытые
        linkFunction.linkTicket(ConfProperties.getProperty("el2ComTic"));
        Thread.sleep(500);
        //переход по ссылке Закрытые
        linkFunction.linkTicket(ConfProperties.getProperty("el3ComTic"));
        Thread.sleep(2000);

    }
}
