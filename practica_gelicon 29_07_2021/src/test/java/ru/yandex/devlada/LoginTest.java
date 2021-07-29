package ru.yandex.devlada;

import org.testng.annotations.Test;


public class LoginTest extends TestInitQuit {
    //Тест 1. Авторизация
    @Test(groups = "notRun")
  //  @Test(groups = "run")
    public void loginTest() {
        driver.get(ConfProperties.getProperty("page1"));
        //ввод логина
        loginPage.inputLogin(ConfProperties.getProperty("loginTrue"));
        //ввод пароля
        loginPage.inputPasswrd(ConfProperties.getProperty("passwordTrue"));
        //нажатие на кнопку "Войти"
        loginPage.clickLoginBtn();
    }
}
