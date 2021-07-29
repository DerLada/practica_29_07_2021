package ru.yandex.devlada;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static ru.yandex.devlada.ConfProperties.getProperty;
//НЕ РАБОТАЕТ! ПРОБЛЕМА С НАЖАТИЕМ КНОПКИ "ВЫБОР"
public class ChoicePatternTest extends TestInitQuit {
    //Тест 7_03 Поиск с помощью использования шаблона. Проверка элемента работы с шаблонами кнопки «Выбор»
    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void choicePatternTest() throws AWTException, InterruptedException {
        driver.get(getProperty("page7"));
        searchPage.clickNameSearch();
        searchPage.inputNameSearch(ConfProperties.getProperty("name01"));
        searchPage.choicePrnBtn();
        Thread.sleep(2000);
        String namePrn = searchPage.getFieldNamePrn("Profile_Search");
        //сравнения полей после выбора шаблона и нажания кнопки выбор
        //сравнение идет только по заполненным полям. Возможно расширить до сравнения по всем текстовым полям
        switch (namePrn) {
            case "Pattern01":
                Assert.assertEquals(ConfProperties.getProperty("fieldNTicketPrn01"), searchPage.getFieldNamePrn(ConfProperties.getProperty("idFieldNTicket")));
                Assert.assertEquals(ConfProperties.getProperty("fieldLetterBodyPrn01"), searchPage.getFieldNamePrn(ConfProperties.getProperty("idFieldLetterBody")));
                Assert.assertEquals(ConfProperties.getProperty("fieldTopicPrn01"), searchPage.getFieldNamePrn(ConfProperties.getProperty("idFieldTopic")));
                break;
            case "Pattern02":
                Assert.assertEquals(ConfProperties.getProperty("fieldNTicketPrn02"), searchPage.getFieldNamePrn(ConfProperties.getProperty("idFieldNTicket")));
                Assert.assertEquals(ConfProperties.getProperty("fieldLetterBodyPrn02"), searchPage.getFieldNamePrn(ConfProperties.getProperty("idFieldLetterBody")));
                break;
            default:
                break;
        }

        //нажать на кнопку "Поиск"
        Thread.sleep(2000);
        searchPage.searchBtn();
    }


}
