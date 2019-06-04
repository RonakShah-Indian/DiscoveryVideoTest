package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Landing Screen locators
 */
public class LandingScreen {

    public LandingScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = Locators.LandingPage.RECOMMENDED_VIDEOS)
    public WebElement recommendedVideos;

    @FindBy(how = How.CLASS_NAME, using = Locators.LandingPage.HOVER_ON_VIDEO)
    public WebElement hoverOnVideos;

    @FindBy(how = How.CLASS_NAME, using = Locators.LandingPage.ADD_TO_FAV)
    public WebElement addToFav;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.DESCRIPTION)
    public WebElement description;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.TITLE)
    public WebElement title;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.FAVOURITE_SHOWS)
    public WebElement favouriteShows;
}
