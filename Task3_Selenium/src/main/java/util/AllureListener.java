package util;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import steps.BaseSteps;

/**
 * Created by 1 on 14.06.2018.
 */
public class AllureListener extends ru.yandex.qatools.allure.junit.AllureRunListener {

    @Override
    public void testFailure(Failure failure){
        takeScreenShot();
        super.testFailure(failure);
    }

    @Attachment(type = "image/png", value = "Скриншот при обшибке")
    public byte[] takeScreenShot(){
        return((TakesScreenshot) BaseSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}