package ru.yandex.devlada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AnswerOnTicketTest extends TestInitQuit {

    @Test(groups = "notRun")
    //@Test(groups = "run")
    public void answerOnTicketTest() throws InterruptedException {
        driver.get(ConfProperties.getProperty("page4"));
        linkFunction.openTicket();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ReplyButton")));
        driver.findElement(By.id("ReplyButton")).click();

        driver.switchTo().frame(0);
        WebElement passwdField = driver.findElement(By.xpath("/html/body"));
        WebElement el  =  driver.switchTo().activeElement();
        new Actions(driver).moveToElement(el).perform();
        passwdField.sendKeys("Тест пройден успешно");
        driver.switchTo().defaultContent();
        Integer num=2;
        WebElement status;
        driver.findElement(By.id("StateID_Search")).click();
        switch (num) {
            case 1:
                status = driver.findElement(By.xpath("html/body/div[8]/div[1]/div/ul/li[1]/a"));
                status.click();
                break;
            case 2:
                status = driver.findElement(By.xpath("html/body/div[8]/div[1]/div/ul/li[2]/a"));
                status.click();
                break;
            case 3:
                status = driver.findElement(By.xpath("html/body/div[8]/div[1]/div/ul/li[3]/a"));
                status.click();
                break;
            case 4:
                status = driver.findElement(By.xpath("html/body/div[8]/div[1]/div/ul/li[4]/a"));
                status.click();
                break;
            default:
                break;
        }
        Thread.sleep(250);
        driver.findElement(By.xpath("html/body/div[3]/div[2]/form/div[2]/div/div/button")).click();

    }
}
