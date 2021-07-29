package ru.yandex.devlada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestInitQuit {
    public static LoginPage loginPage;//страница авторизации
    public static LinkFunction linkFunction;//страница профиля, на которую мы попадаем после входа
    public static WebDriver driver;
    public static NewTicketPage newTicketPage;//страница Новая заявка
    public static SearchPage searchPage;


  //  @BeforeMethod(groups = "notRun")
    @BeforeMethod(groups = "run")
    public static void  setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        System.setProperty("webdriver.chrome.binary", ConfProperties.getProperty("chromeexe"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        linkFunction = new LinkFunction(driver);
        linkFunction = new LinkFunction(driver);
        newTicketPage = new NewTicketPage(driver);
        searchPage = new SearchPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page1"));
    }
//    @BeforeMethod(groups = "notRun")
    @BeforeMethod(groups = "run")
    public static void  setup1() {
        //ввод логина
        loginPage.inputLogin(ConfProperties.getProperty("loginTrue"));
        //ввод пароля
        loginPage.inputPasswrd(ConfProperties.getProperty("passwordTrue"));
        //нажатие на кнопку "Войти"
        loginPage.clickLoginBtn();
    }
    @AfterMethod(groups = "notRun")
   // @AfterMethod(groups = "run")
    public static void tearDown() {
        //выход из аккаунта
        linkFunction.logout();
        driver.quit();
    }
}
