import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;
import java.util.HashMap;

/**
 * Created by 1 on 14.06.2018.
 */

public class SbrfTestForAllureReport extends BaseSteps {

    @Test
    @Title("Страхование")
    public void testnewSbrf(){

        MainSteps mainSteps = new MainSteps();
        //error 404
        MainSteps mainSteps1 = new MainSteps();
        TravelsSteps travelsSteps = new TravelsSteps();
        Page1Step page1step = new Page1Step();
        Page2Step page2step = new Page2Step();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Застрахованные: Фамилия", "Ivanov");
        testData.put("Застрахованные: Имя", "Ivan");
        testData.put("Застрахованные: Дата рождения", "05.05.1990");
        testData.put("Фамилия", "Петров");
        testData.put("Имя", "Сергей");
        testData.put("Отчество", "Иванович");
        testData.put("Дата рождения", "15.09.1980");
        testData.put("Серия паспорта", "5010");
        testData.put("Номер паспорта", "215316");
        testData.put("Дата выдачи", "10.06.2011");
        testData.put("Место выдачи", "ОУФМС РОССИИ УВД ПО ЦЕНТРАЛЬНОМУ АДМИНИСТРАТИВНОМУ ОКРУГУ ГОРОД МОСКВА");

        mainSteps.stepSelectMainMenu("Страхование");
        mainSteps.stepSelectSubMenu("Путешествия и покупки");

        mainSteps1.stepSelect1MainMenu("Страхование");
        mainSteps1.stepSelect1SubMenu("Путешествия и покупки");

        travelsSteps.stepTitle("Страхование путешественников");
        travelsSteps.stepissueButtonTravels();
        travelsSteps.switchTab();

        page1step.stepSelectSum();
        page1step.stepissueButton();

        page2step.stepFillFields(testData);
        page2step.stepCheckFillFields(testData);
        page2step.stepcontButton();
        page2step.stepPhone("Номер телефона вводится в 10-ти значном формате");



    }
}