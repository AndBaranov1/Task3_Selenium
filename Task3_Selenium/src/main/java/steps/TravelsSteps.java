package steps;

import pages.TravelsPage;
import ru.yandex.qatools.allure.annotations.Step;
import static org.junit.Assert.assertTrue;

/**
 * Created by 1 on 14.06.2018.
 */
public class TravelsSteps extends BaseSteps {

    @Step("выполнено нажатие на кнопку - Оформить онлайн")
    public void stepissueButtonTravels(){
        new TravelsPage(driver).issueButtonClick.click();
    }


    @Step("заголовок страницы - {0}")
    public void stepTitle(String expectedTitle){
        String actualTitle = new TravelsPage(driver).title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("переход на другую вкладку")
    public void switchTab() {
        new TravelsPage(driver).switchTab();
    }

}