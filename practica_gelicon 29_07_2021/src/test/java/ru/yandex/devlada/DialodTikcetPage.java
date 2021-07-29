package ru.yandex.devlada;

public class DialodTikcetPage {
 /**   public static WebDriver driver;
    public DialodTikcetPage(WebDriver driver) {
        this.driver = driver; }

    Actions action;
    //метод для перехода по ссылкам Меню
    public void linkMenu(String xpathEl) {
        action = new Actions(driver);
        WebElement menuBtn = driver.findElement(By.xpath("html/body/div[2]/ul[1]/li[1]/a"));
        action.moveToElement(menuBtn).moveToElement(driver.findElement(By.xpath(xpathEl))).click().build().perform();
    }
    //метод для перехода по ссылкам страниц Мои заявки и Заявки компании
    public void linkTicket(String xpathEl) {
        WebElement ticketBtn = driver.findElement(By.xpath(xpathEl));
        ticketBtn.click();
    }*/
}
