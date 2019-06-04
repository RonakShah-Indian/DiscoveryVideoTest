package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * My Video screen locators
 */
public class MyVideoScreen {

    public MyVideoScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = Locators.MyVideoPage.DESCRIPTION)
    public WebElement description;

    @FindBy(how = How.XPATH, using = Locators.MyVideoPage.FAVOURITE_SHOWS)
    public WebElement favouriteShows;

    @FindBy(how = How.CLASS_NAME, using = Locators.MyVideoPage.HOVER_ON_SHOWS)
    public WebElement hoverOnShows;

    @FindBy(how = How.XPATH, using = Locators.MyVideoPage.TITLE)
    public WebElement title;
}
