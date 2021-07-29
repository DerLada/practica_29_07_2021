package ru.yandex.devlada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

//Класс страницы поиска по заявкам
public class SearchPage {
    public WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver; }
    //Поиск шаблона: нажать на поле имени шаблона
    public void clickNameSearch() {
        WebElement nameField = driver.findElement(By.id("Profile_Search"));
        nameField.click();
    }
    //Поиск шаблона: выбрать имя шаблона
    public void inputNameSearch(String name1) throws AWTException {
        WebElement nameField = driver.findElement(By.id("Profile_Search"));
        nameField.sendKeys(name1);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    //Поиск шаблона: нажать кнопку Выбор
    public void choicePrnBtn() {
        WebElement choiceBtn = driver.findElement(By.xpath(".//*[contains(text(), 'Выбор')]/.."));
        choiceBtn.click();
    }
    //Поиск шаблона: нажать кнопку Удалить
    public void DeletePrnBtn() {
        WebElement deleteBtn = driver.findElement(By.xpath(".//*[contains(text(), 'Удаление')]/.."));
        deleteBtn.click();
    }
    //Поиск шаблона: нажать кнопку Поиск
    public void searchPrnBtn() {
        WebElement parentSearchBtn = driver.findElement(By.className("Row"));
        WebElement searchBtn = parentSearchBtn.findElement(By.xpath(".//*[contains(text(), 'Поиск')]/.."));
        searchBtn.click();
    }

    //ДЛЯ ТЕСТА СОЗДАНИЕ ШАБЛОНА ПОИСКА
    //Поставить галочку "Сохранить как шаблон поиска"
    public void savePrn() {
        WebElement saveField = driver.findElement(By.id("SaveProfile"));
        saveField.click();
    }
    //Ввести имя шаблона поиска
    public void createPrn(String name) {
        WebElement nameCreatField = driver.findElement(By.cssSelector("input#Profile"));
        nameCreatField.click();
        nameCreatField.sendKeys(name);
    }
    //Нажать кнопку Поиск (внизу страницы)
    public void searchBtn() {
        WebElement searchBtn = driver.findElement(By.id("Submit"));
        searchBtn.click();
    }
    //Заполняем поля поиска с вводом текстовых значений
    public void fieldInput(String text, String idField) {
        WebElement field = driver.findElement(By.id(idField));
        field.sendKeys(text);
    }
    //метод для получения текста в поле по id элемента
    public String getFieldNamePrn(String id) {
        WebElement nameField = driver.findElement(By.id(id));
        String FieldNamePrn = nameField.getText();
        return FieldNamePrn; }
}
