package com.barclay.testbase;

import com.barclay.basepage.BasePage;
import com.barclay.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.barclays.co.uk/";

    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();;

    }
}
