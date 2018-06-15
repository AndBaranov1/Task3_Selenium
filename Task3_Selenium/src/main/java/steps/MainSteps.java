package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by 1 on 14.06.2018.
 */
public class MainSteps extends BaseSteps {

    @Step("выбран пункт меню {0}")
    public void stepSelectMainMenu(String menuItem){
        new MainPage(driver).selectMainMenu(menuItem);
    }

    @Step("выбран вид страхования {0}")
    public void stepSelectSubMenu(String menuItem){
        new MainPage(driver).selectSubMenu(menuItem);
    }

    /**
     * Добавлен дополнительный выбор, так как есть баг: При переходе на форму "Путешествия и покупки" ошибка 404.
     * Если еще раз кликуть на "Страхование", "Путешествия и покупки" то переходит на форму "Сбербанк страхование
     */
    @Step("выбран пункт меню {0}")
    public void stepSelect1MainMenu(String menuItem){
        new MainPage(driver).select1MainMenu(menuItem);
    }

    @Step("выбран вид страхования {0}")
    public void stepSelect1SubMenu(String menuItem){
        new MainPage(driver).select1SubMenu(menuItem);
    }

}