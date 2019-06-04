package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil{


    private BaseUtil base;
    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {
        System.out.println("Opening the browser : Chrome");
        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        base.driver = new ChromeDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) {
       base.driver.quit();
    }

}
