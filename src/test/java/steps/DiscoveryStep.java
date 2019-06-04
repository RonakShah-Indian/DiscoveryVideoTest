package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LandingScreen;
import pages.Locators;
import pages.MyVideoScreen;

import java.util.ArrayList;
import java.util.List;

public class DiscoveryStep extends BaseUtil {

    private  BaseUtil base;
    protected LandingScreen landingScreen = new LandingScreen(base.driver);
    protected MyVideoScreen myVideoScreen= new MyVideoScreen(base.driver);
    List<String> description= new ArrayList<String>();
    List<String> title= new ArrayList<String>();
    List<String> descriptionVerify= new ArrayList<String>();
    List<String> titleVerify= new ArrayList<String>();
    List<WebElement>addToFav;
    List<WebElement> hoverOnVideo;
    List<WebElement> hoverOnShows;
    String url="http://www.discovery.com";

    @Given("^a user goes to discovery homepage$")
    public void openUrl() {
        navigateTo(url);
    }

    @When("^a user adds videos to favourite$")
    public void addToFav() {
        swipeToElement(landingScreen.recommendedVideos);
        hoverOnVideo= base.driver.findElements(By.className(Locators.LandingPage.HOVER_ON_VIDEO));
        for(int i=0;i<2;i++){
            waitForAnElement();
            hoverOnVideo(hoverOnVideo.get(i));
            description.add(base.driver.findElements(By.xpath(Locators.LandingPage.DESCRIPTION)).get(i).getText());
            title.add(base.driver.findElements(By.xpath(Locators.LandingPage.TITLE)).get(i).getText());
            addToFav= base.driver.findElements(By.className(Locators.LandingPage.ADD_TO_FAV));
            addToFav.get(i).click();
        }
    }

    @Then("^the videos should be visible in my videos section$")
    public void checkInMyVideos() {
        url="https://www.discovery.com/my-videos";
        getUrl(url);
        swipeToElement(myVideoScreen.favouriteShows);
        hoverOnShows= base.driver.findElements(By.className(Locators.MyVideoPage.HOVER_ON_SHOWS));
        for(int i=0;i<2;i++){
            waitForAnElement();
            hoverOnVideo(hoverOnShows.get(1-i));
            waitForAnElement();
            descriptionVerify.add(base.driver.findElements(By.xpath(Locators.MyVideoPage.DESCRIPTION)).get(1-i).getText());
            titleVerify.add(base.driver.findElements(By.xpath(Locators.MyVideoPage.TITLE)).get(1-i).getText());
            waitForAnElement();
            Assert.assertEquals("Description is same.",description.get(i),descriptionVerify.get(i));
            Assert.assertEquals("Title is same.",title.get(i),titleVerify.get(i));
        }
    }
}
