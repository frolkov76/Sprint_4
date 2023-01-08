package PageObject;


import org.hamcrest.MatcherAssert;

import static org.hamcrest.CoreMatchers.startsWith;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)

public class OrderScooterTest extends BaseTest {


    private final String positionOrderBottom; //нажатие верхней кнопки "Заказать" - topOrderButton, нижней кнопки -  bottomOrderButton
    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String telefon;
    private final String deliveryData;
    private final String rentalPeriod;
    private final String scooterColor;
    private final String commentsForCourier;

    private final static String orderHasBeenPlacedMessageText = "Номер заказа:";


    public OrderScooterTest(String positionOrderBottom, String name, String lastName, String address, String metroStation, String telefon,
                            String deliveryData, String rentalPeriod, String scooterColor, String commentsForCourier) {

        this.positionOrderBottom = positionOrderBottom;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.telefon = telefon;
        this.deliveryData = deliveryData;
        this.rentalPeriod = rentalPeriod;
        this.scooterColor = scooterColor;
        this.commentsForCourier = commentsForCourier;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"topOrderButton", "Гари", "Поттер", "ул Мира д.65", "Сокольники", "89245556162", "11.01.2023", "сутки", "black", "Самокат заберет Волондемор."},
                {"bottomOrderButton", "Сергей", "Петров", "ул Матросов 16", "Лубянка", "89241176677", "05.02.2023", "двое суток", "gray", "Позвонить за 30 минут"},

        };
    }

    @Test
    public void scooterOrderPositiveTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.clickOrderButton(positionOrderBottom);

        FirstOrderPage firstOrderPage = new FirstOrderPage(driver);
        firstOrderPage.inputName(name);
        firstOrderPage.inputLastName(lastName);
        firstOrderPage.inputAddress(address);
        firstOrderPage.inputMetroStation(metroStation);
        firstOrderPage.inputTelefon(telefon);
        firstOrderPage.clickBottonNext();

        SecondOrderPage secondOrderPage = new SecondOrderPage(driver);
        secondOrderPage.inputScooterDelyveryDate(deliveryData);
        secondOrderPage.inputRentalPeriod(rentalPeriod);
        secondOrderPage.inputScooterColor(scooterColor);
        secondOrderPage.inputCommentsForCourier(commentsForCourier);
        secondOrderPage.clickOrderButton();
        secondOrderPage.clickOrderButtonYes();
        String actual = secondOrderPage.orderHasBeenPlaced();
        MatcherAssert.assertThat("Нет сообщения \"Заказ оформлен\" с номером заказа", actual, startsWith(orderHasBeenPlacedMessageText));
    }
}