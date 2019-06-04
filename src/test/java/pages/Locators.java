package pages;


/**
 * Contains elements locator
 */
public class Locators {

    /* Landing Page Locators */

    public static final class LandingPage {

        public static final String RECOMMENDED_VIDEOS = "//div[contains(text(),'Recommended')]";
        public static final String HOVER_ON_VIDEO = "showTileSquare__contentBox";
        public static final String TITLE = "//div[@class='showTileSquare__content']/h3/div[1]";
        public static final String DESCRIPTION = "//div[@class='showTileSquare__description']/div[1]";
        public static final String ADD_TO_FAV = "my-favorites-button-container";
        public static final String FAVOURITE_SHOWS = "//div[@class='localStorageCarousel__wrapper']";

    }
    /* My Video Page Locators */
    public static final class MyVideoPage {

        public static final String HOVER_ON_SHOWS = "showTileSquare__contentBox";
        public static final String FAVOURITE_SHOWS = "//div[@class='localStorageCarousel__wrapper']";
        public static final String TITLE = "//div[@class='showTileSquare__content']/h3/div[1]";
        public static final String DESCRIPTION = "//div[@class='showTileSquare__description']/div[1]";
    }
}
