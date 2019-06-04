package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Base util class consists of common methods
 */
public class BaseUtil {

    public static WebDriver Driver;
    public void swipeToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void hoverOnVideo(WebElement element){
        Actions action= new Actions(Driver);
        action.moveToElement(element).build().perform();
    }

    public void navigateTo(String url){
        Driver.navigate().to(url);
        Driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void getUrl(String url){
        Driver.get(url);
        Driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void waitForAnElement() throws InterruptedException {
        Thread.sleep(2000);
    }
}
