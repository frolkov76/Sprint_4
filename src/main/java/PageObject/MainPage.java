package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage {

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    //Кнопка cookie "да все привыкли"
    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    //Кнопка "Заказать"
    private final By topOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");

    //Нижняя кнопка "Заказать"
    private final By bottomOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Выпадающий список "Вопросы о важном"
    //Вопрос "Сколько это стоит? И как оплатить?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantItemHowMuchItCosts = By.id("accordion__heading-0");
    //элемент ответа
    private final By elementAnswerAboutTheImportantItemHowMuchItCosts = By.id("accordion__panel-0");

    //Вопрос "Хочу сразу несколько самокатов! Так можно?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantItemSeveralScooters = By.id("accordion__heading-1");
    //элемент ответа
    private final By elementAnswerAboutTheImportantItemSeveralScooters = By.id("accordion__panel-1");

    //Вопрос "Как рассчитывается время аренды?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantRentalTime = By.id("accordion__heading-2");
    //элемент ответа
    private final By elementAnswerAboutTheImportantRentalTime = By.id("accordion__panel-2");

    //Вопрос "Можно ли заказать самокат прямо на сегодня?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantItemScooterToday = By.id("accordion__heading-3");
    //элемент ответа
    private final By elementAnswerAboutTheImportantItemScooterToday = By.id("accordion__panel-3");

    //Вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantItemExtendTheOrder = By.id("accordion__heading-4");
    //элемент ответа
    private final By elementAnswerAboutTheImportantItemExtendTheOrder = By.id("accordion__panel-4");

    //Вопрос "Вы привозите зарядку вместе с самокатом?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantItemChargingForScooter = By.id("accordion__heading-5");
    //элемент ответа
    private final By elementAboutTheImportantItemChargingForScooter = By.id("accordion__panel-5");

    //Вопрос "Можно ли отменить заказ?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantItemCancelTheOrder = By.id("accordion__heading-6");
    //элемент ответа
    private final By elementAnswerAboutTheImportantItemCancelTheOrder = By.id("accordion__panel-6");

    //Вопрос "Я живу за МКАДом, привезёте?"
    //элемент вопроса
    private final By elementQuestionsAboutTheImportantItemLiveBeyondTheMKAD= By.id("accordion__heading-7");
    //элемент ответа
    private final By elementAnswerAboutTheImportantItemLiveBeyondTheMKAD = By.id("accordion__panel-7");


    //открытие страницы тестирования
    public void openPage() {
        driver.get(pageUrl);
    }

    //нажатие кнопки "Заказать"
    public void clickOrderButton(String position) {
        if (position.equals("topOrderButton")) {
            driver.findElement(topOrderButton).click(); //нажатие верхней кнопки "Заказать"
        }
        else if (position.equals("bottomOrderButton")){
            driver.findElement(bottomOrderButton).click(); //нажатие нижней кнопки "Заказать"
        }
        else {
            System.out.println("Выберите верхнюю или нижнюю кнопку Заказать");
        }
    }

    //нажатие кнопки cookie "да все привыкли"
    public void clickCookieButton(){
        driver.findElement(cookieButton).click();
    }

    //скролл до элемента списка вопросов о важном
    public void scrollBottom() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //выбор вопроса о важном "Сколько это стоит? И как оплатить?"
    public void clickQuestionsAboutTheImportantItemHowMuchItCosts() {
        driver.findElement(elementQuestionsAboutTheImportantItemHowMuchItCosts).click();
    }

    //получение актуального значения ответа на вопрос о важном "Сколько это стоит? И как оплатить?"
    public String actualAnswerAboutTheImportantItemHowMuchItCosts() {
        wait(elementAnswerAboutTheImportantItemHowMuchItCosts);
        String text = driver.findElement(elementAnswerAboutTheImportantItemHowMuchItCosts).getText();
        return text;
    }

    private void wait(By elementAnswerAboutTheImportantItemHowMuchItCosts) {
    }


    //выбор вопроса о важном "Хочу сразу несколько самокатов! Так можно?"
    public void clickQuestionsAboutTheImportantItemSeveralScooters() {
        driver.findElement(elementQuestionsAboutTheImportantItemSeveralScooters).click();
    }

    //получение актуального значения ответа на вопрос о важном "Хочу сразу несколько самокатов! Так можно?"
    public String actualAnswerAboutTheImportantItemSeveralScooters() {
        wait(elementAnswerAboutTheImportantItemSeveralScooters);
        String text = driver.findElement(elementAnswerAboutTheImportantItemSeveralScooters).getText();
        return text;
    }

    //выбор вопроса о важном "Как рассчитывается время аренды?"
    public void clickQuestionsAboutTheImportantRentalTime() {
        driver.findElement(elementQuestionsAboutTheImportantRentalTime).click();
    }

    //получение актуального значения ответа на вопрос о важном "Как рассчитывается время аренды?"
    public String actualAnswerAboutTheImportantRentalTime() {
        wait(elementAnswerAboutTheImportantRentalTime);
        String text = driver.findElement(elementAnswerAboutTheImportantRentalTime).getText();
        return text;
    }

    //выбор вопроса о важном "Можно ли заказать самокат прямо на сегодня?"
    public void clickQuestionsAboutTheImportantItemScooterToday() {
        driver.findElement(elementQuestionsAboutTheImportantItemScooterToday).click();
    }

    //получение актуального значения ответа на вопрос о важном "Можно ли заказать самокат прямо на сегодня?"
    public String actualAnswerAboutTheImportantItemScooterToday() {
        wait(elementAnswerAboutTheImportantItemScooterToday);
        String text = driver.findElement(elementAnswerAboutTheImportantItemScooterToday).getText();
        return text;
    }

    //выбор вопроса о важном "Можно ли продлить заказ или вернуть самокат раньше?"
    public void clickQuestionsAboutTheImportantItemExtendTheOrder() {
        driver.findElement(elementQuestionsAboutTheImportantItemExtendTheOrder).click();
    }

    //получение актуального значения ответа на вопрос о важном "Можно ли продлить заказ или вернуть самокат раньше?"
    public String actualAnswerAboutTheImportantItemExtendTheOrder() {
        wait(elementAnswerAboutTheImportantItemExtendTheOrder);
        String text = driver.findElement(elementAnswerAboutTheImportantItemExtendTheOrder).getText();
        return text;
    }

    //выбор вопроса о важном "Вы привозите зарядку вместе с самокатом?"
    public void clickQuestionsAboutTheImportantItemChargingForScooter() {
        driver.findElement(elementQuestionsAboutTheImportantItemChargingForScooter).click();
    }

    //получение актуального значения ответа на вопрос о важном "Вы привозите зарядку вместе с самокатом?"
    public String actualAnswerAboutTheImportantItemChargingForScooter() {
        wait(elementAboutTheImportantItemChargingForScooter);
        String text = driver.findElement(elementAboutTheImportantItemChargingForScooter).getText();
        return text;
    }

    //выбор вопроса о важном "Можно ли отменить заказ?"
    public void clickQuestionsAboutTheImportantItemCancelTheOrder() {
        driver.findElement(elementQuestionsAboutTheImportantItemCancelTheOrder).click();
    }
    //получение актуального значения ответа на вопрос о важном "Можно ли отменить заказ?"
    public String actualAnswerAboutTheImportantItemCancelTheOrder() {
        wait(elementAnswerAboutTheImportantItemCancelTheOrder);
        String text = driver.findElement(elementAnswerAboutTheImportantItemCancelTheOrder).getText();
        return text;
    }

    //выбор вопроса о важном "Я жизу за МКАДом, привезёте?"
    public void clickQuestionsAboutTheImportantItemLiveBeyondTheMKAD() {
        driver.findElement(elementQuestionsAboutTheImportantItemLiveBeyondTheMKAD).click();
    }

    //получение актуального значения ответа на вопрос о важном "Я жизу за МКАДом, привезёте?"
    public String actualAnswerAboutTheImportantItemLiveBeyondTheMKAD() {
        wait(elementAnswerAboutTheImportantItemLiveBeyondTheMKAD);
        String text = driver.findElement(elementAnswerAboutTheImportantItemLiveBeyondTheMKAD).getText();
        return text;
    }

}