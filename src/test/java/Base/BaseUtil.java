package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Base util class consists of common methods
 */
public class BaseUtil {

    public static WebDriver driver;
    public void swipeToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void hoverOnVideo(WebElement element){
        Actions action= new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void getUrl(String url){
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void waitForAnElement() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
