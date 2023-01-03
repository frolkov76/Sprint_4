package PageObject;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FAQQuestionsTest extends BaseTest {

    //Выпадающий список "Вопросы о важном"
    //Ответ на вопрос 1
    private final String answerAboutTheImportantItemHowMuchItCosts = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    //Ответ на вопрос 2
    private final String answerAboutTheImportantItemSeveralScooters = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    //Ответ на вопрос 3
    private final String answerAboutTheImportantRentalTime = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    //Ответ на вопрос 4
    private final String answerAboutTheImportantItemScooterToday = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    //Ответ на вопрос 5
    private final String answerAboutTheImportantItemExtendTheOrder = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    //Ответ на вопрос 6
    private final String answerAboutTheImportantItemChargingForScooter = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    //Ответ на вопрос 7
    private final String answerAboutTheImportantItemCancelTheOrder = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    //Ответ на вопрос 8
    private final String answerAboutTheImportantItemLiveBeyondTheMKAD = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    // тест 1
    @Test
    public void questionsAboutTheImportantItemHowMuchItCostsComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemHowMuchItCosts();
        String actual = mainPage.actualAnswerAboutTheImportantItemHowMuchItCosts();
        assertEquals("Ответ несоответствует вопросу!", answerAboutTheImportantItemHowMuchItCosts, actual);
    }

    // тест 2
    @Test
    public void questionsAboutTheImportantItemSeveralScootersComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemSeveralScooters();
        String actual = mainPage.actualAnswerAboutTheImportantItemSeveralScooters();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemSeveralScooters, actual);
    }

    // тест 3
    @Test
    public void questionsAboutTheImportantRentalTimeComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantRentalTime();
        String actual = mainPage.actualAnswerAboutTheImportantRentalTime();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantRentalTime, actual);
    }

    // тест 4
    @Test
    public void questionsAboutTheImportantItemScooterTodayComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemScooterToday();
        String actual = mainPage.actualAnswerAboutTheImportantItemScooterToday();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemScooterToday, actual);
    }

    // тест 5
    @Test
    public void questionsAboutTheImportantItemExtendTheOrderComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemExtendTheOrder();
        String actual = mainPage.actualAnswerAboutTheImportantItemExtendTheOrder();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemExtendTheOrder, actual);
    }

    // тест 6
    @Test
    public void questionsAboutTheImportantItemChargingForScooterComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemChargingForScooter();
        String actual = mainPage.actualAnswerAboutTheImportantItemChargingForScooter();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemChargingForScooter, actual);
    }

    // тест 7
    @Test
    public void questionsAboutTheImportantItemCancelTheOrderComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemCancelTheOrder();
        String actual = mainPage.actualAnswerAboutTheImportantItemCancelTheOrder();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemCancelTheOrder, actual);
    }

    // тест 8
    @Test
    public void questionsAboutTheImportantItemLiveBeyondTheMKADComplianceAnswerTestTrue() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickCookieButton();
        mainPage.scrollBottom();
        mainPage.clickQuestionsAboutTheImportantItemLiveBeyondTheMKAD();
        String actual = mainPage.actualAnswerAboutTheImportantItemLiveBeyondTheMKAD();
        assertEquals("Несоответствует ответ вопросу!", answerAboutTheImportantItemLiveBeyondTheMKAD, actual);
    }


}
