package PageObject;


import org.openqa.selenium.*;

public class SecondOrderPage {

    //Страница "Про аренду"
    public SecondOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    //Поле "*Когда привезти самокат"
    private final By scooterDelyveryDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //Поле "* Срок аренды"
    private final By rentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder']");

    //Поле "Комментарий для курьера"
    private final By commentsForCourierField = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    //элемент - текст сообщения "Заказ оформлен"
    private final By messageOrderPlaced = By.xpath(".//div[@class='Order_Text__2broi']");

    //Кнопка "Заказать"
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Кнопка "Да" сообщение "Хотите оформить заказ"  ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"
    private final By orderButtonYes = By.xpath(".//button[text()='Да']");


    //заполнения поля "* Когда привезти самокат"
    public void inputScooterDelyveryDate(String name) {
        driver.findElement(scooterDelyveryDateField).sendKeys(name + Keys.ENTER);
    }

    //заполнения поля "* Срок аренды"
    public void inputRentalPeriod(String name) {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(By.xpath(".//div[(@class='Dropdown-option') and (text()='" + name + "')]")).click();
    }

    //заполнения поля "Цвет самоката"
    public void inputScooterColor(String name) {
        if ((name.equals("black")) | (name.equals("grey"))) {
            driver.findElement(By.xpath(".//label[@for='" + name + "']")).click();
        }
    }

    //заполнения поля "Комментарий для курьера"
    public void inputCommentsForCourier(String name) {
        driver.findElement(commentsForCourierField).sendKeys(name);
    }

    //нажатие кнопки "Заказать"
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    //нажатие кнопки "Да" сообщение "Хотите оформить заказ"
    public void clickOrderButtonYes() {

        driver.findElement(orderButtonYes).click();
    }

    //получение текста сообщения "Заказ оформлен"
    public String orderHasBeenPlaced() {
        return driver.findElement(messageOrderPlaced).getText();
    }
}