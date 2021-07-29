package ru.yandex.devlada;

import org.testng.annotations.Test;

public class CreatePatternTest extends TestInitQuit {
    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void createPatternTest() throws InterruptedException {
        driver.get(ConfProperties.getProperty("page7"));
        searchPage.fieldInput(ConfProperties.getProperty("fieldNTicketPrn01"), ConfProperties.getProperty("idFieldNTicket"));
        searchPage.fieldInput(ConfProperties.getProperty("fieldLetterBodyPrn01"), ConfProperties.getProperty("idFieldLetterBody"));
        searchPage.fieldInput(ConfProperties.getProperty("fieldTopicPrn01"), ConfProperties.getProperty("idFieldTopic"));

        //ДЛЯ СОЗДАНИЯ ШАБЛОНА Pattern02
        /**
        searchPage.fieldInput(ConfProperties.getProperty("fieldNTicketPrn02"), ConfProperties.getProperty("idFieldNTicket"));
        searchPage.fieldInput(ConfProperties.getProperty("fieldLetterBodyPrn02"), ConfProperties.getProperty("idFieldLetterBody"));
 */
        searchPage.savePrn();
        searchPage.createPrn(ConfProperties.getProperty("name01"));
        Thread.sleep(1000);
        searchPage.searchBtn();
        Thread.sleep(3000);
    }

}
