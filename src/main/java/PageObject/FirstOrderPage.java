package PageObject;


import org.openqa.selenium.*;

public class FirstOrderPage {

    //Страница "Для кого самокат"
    public FirstOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    //Поле "Имя"
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");

    //Поле "Фамилия"
    private final By lastNameField = By.xpath(".//input[@placeholder='* Фамилия']");

    //Поле "Адрес: куда привезти заказ"
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //Поле "Станция метро"
    private final By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");

    //Поле "Телефон: на него позвонит курьер"
    private final By telefonField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //Кнопка "Далее"
    private final By bottonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    //заполнения поля "Имя"
    public void inputName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    //заполнения поля "Фамилия"
    public void inputLastName(String name) {
        driver.findElement(lastNameField).sendKeys(name);
    }

    //заполнения поля "Адрес: куда привезти заказ"
    public void inputAddress(String name) {
        driver.findElement(addressField).sendKeys(name);
    }

    //заполнение поля "Станция метро"
    public void inputMetroStation(String name) {
        driver.findElement(metroStationField).sendKeys(name);
        driver.findElement(metroStationField).sendKeys("" + Keys.ARROW_DOWN + Keys.ENTER);
    }

    //заполнения поля "Телефон: на него позвонит курьер"
    public void inputTelefon(String name) {
        driver.findElement(telefonField).sendKeys(name);
    }

    //нажатие кнопки "Далее"
    public void clickBottonNext() {
        driver.findElement(bottonNext).click();
    }


}
