package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
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
    //открытие страницы тестирования
    public void openPage() {
        driver.get(pageUrl);
    }
    //скролл до элемента списка вопросов о важном
    public void scrollBottom() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickOnQuestion(int index) {
        driver.findElement(By.id("accordion__heading-" + index)).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("accordion__panel-" + index)));
    }
    public String equalTextAnswer(int index) {

        return driver.findElement(By.id("accordion__panel-" + index)).getText();
    }
    //нажатие кнопки "Заказать"
    public void clickOrderButton(String position) {
        if (position.equals("topOrderButton")) {
            driver.findElement(topOrderButton).click(); //нажатие верхней кнопки "Заказать"
        } else if (position.equals("bottomOrderButton")) {
            driver.findElement(bottomOrderButton).click(); //нажатие нижней кнопки "Заказать"
        } else {
            System.out.println("Выберите верхнюю или нижнюю кнопку Заказать");
        }
    }
    //нажатие кнопки cookie "да все привыкли"
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }


}
