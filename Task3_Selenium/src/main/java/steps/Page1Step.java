package steps;

import pages.Page1;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by 1 on 14.06.2018.
 */
public class Page1Step extends BaseSteps{

    @Step("выполнен выбор минимальной суммы")
    public void stepSelectSum(){
        new Page1(driver).titlesumma.click();
    }

    @Step("выполнено нажатие на кнопку - Оформить")
    public void stepissueButton(){
        new Page1(driver).issueButton.click();
    }


}