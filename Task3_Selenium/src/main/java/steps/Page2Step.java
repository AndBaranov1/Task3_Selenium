package steps;

import pages.Page2;
import ru.yandex.qatools.allure.annotations.Step;
import java.util.HashMap;
import static org.junit.Assert.assertTrue;

/**
 * Created by 1 on 14.06.2018.
 */
public class Blanck2PageStep extends BaseSteps {

    @Step("поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value){
        new Page2(driver).fillField(field, value);
    }

    @Step("заполняются поля")
    public void stepFillFields(HashMap<String, String> fields){
        fields.forEach(this::stepFillField);
    }

    @Step("поле {0} заполнено значением {1}")
    public void stepCheckFillField(String field, String value){
        String actual = new Page2(driver).getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("поля заполнены верно")
    public void stepCheckFillFields(HashMap<String, String> fields){
        fields.forEach(this::stepCheckFillField);
    }

    @Step("текст ошибка о пустых контактных данных - {0}")
    public void stepPhone(String expectedPhone){
        String actualPhone = new Page2(driver).phone.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualPhone, expectedPhone), actualPhone.contains(expectedPhone));
    }

    @Step("выполнено нажатие на кнопку - Продолжить")
    public void stepcontButton(){
        new Page2(driver).contButton.click();
    }
}
