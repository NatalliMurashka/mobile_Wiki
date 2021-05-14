package mobile1.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mobile1.pages.PageElements;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.List;

public class FirstTest {

//	private AppiumDriver driver;
	public static AppiumDriver driver;
	
	PageElements pageElm = new PageElements(); 

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", ".main.MainActivity");
        capabilities.setCapability("app", "C:/Users/natam/eclipse-workspace/mobile/Mobile1/org.wikipedia.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    
    
    @Test
    public void firstTest() {
    	
    	pageElm.waitForElementAndClick(Search, "Cannot find Search Wikipedia input", 5);
   	
    	
    
//    	pageElm.waitForElementAndClick
//                (
//                		By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
//                        "Cannot find Search Wikipedia input",
//                        5
//                );

//        waitForElementAndSendKeys(
//                By.xpath("//*[contains(@text,'Searchâ€¦')]"),
//                "Java",
//                "Cannot find search input",
//                5
//        );
//
//        waitForElementPresent
//                (By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']" +
//                                "//*[@text='Object-oriented programming language']"),
//                        "Cannot find 'Object-oriented programming language' topic searching by Java",
//                        15
//                );
//    }
//
//    @Test
//    public void testCancelSearch() {
//        waitForElementAndClick(
//                By.id("org.wikipedia:id/search_container"),
//                "Cannot find Search Wikipedia input",
//                5
//        );
//
//        waitForElementAndSendKeys(
//                By.xpath("//*[contains(@text,'Searchâ€¦')]"),
//                "Java",
//                "Cannot find search input",
//                5
//        );
//
//        waitForElementAndClear(
//                By.id("org.wikipedia:id/search_src_text"),
//                "Cannot find search field",
//                5
//        );
//
//        waitForElementAndClick(
//                By.id("org.wikipedia:id/search_close_btn"),
//                "Cannot find X to cancel search",
//                5
//        );
//
//        waitForElementNotPresent(
//                By.id("org.wikipedia:id/search_close_btn"),
//                "X is still present on the page",
//                5
//        );
//    }
//
//    @Test
//    public void testCompareArticleTitle() {
//        waitForElementAndClick
//                (
//                        By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
//                        "Cannot find Search Wikipedia input",
//                        5
//                );
//
//        waitForElementAndSendKeys(
//                By.xpath("//*[contains(@text,'Searchâ€¦')]"),
//                "Java",
//                "Cannot find search input",
//                5
//        );
//
//        waitForElementAndClick
//                (
//                        By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']" +
//                                "//*[@text='Object-oriented programming language']"),
//                        "Cannot find Search Wikipedia input",
//                        5
//                );
//
//        WebElement title_element = waitForElementPresent
//                (
//                        By.id("org.wikipedia:id/view_page_title_text"),
//                        "Cannot find article title",
//                        8
//                );
//
//        String article_title = title_element.getAttribute("text");
//
//        Assert.assertEquals(
//                "We see unexpected title",
//                "Java (programming language)",
//                article_title
//        );
//    }
//
//    @Test
//    public void testCheckSearchFieldText() {
//        waitForElementAndClick
//                (
//                        By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
//                        "Cannot find Search Wikipedia input",
//                        5
//                );
//
//        assertElementHasText(
//                By.id("org.wikipedia:id/search_src_text"),
//                "Searchâ€¦",
//                "Cannot locate Search element",
//                6
//        );
//    }
//
//    @Test
//    public void testSearchCancel() {
//        waitForElementAndClick
//                (
//                        By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
//                        "Cannot find Search Wikipedia input",
//                        5
//                );
//
//        waitForElementAndSendKeys(
//                By.xpath("//*[contains(@text,'Searchâ€¦')]"),
//                "Macbook",
//                "Cannot find search input",
//                5
//        );
//
//        assertResultsNumber(
//                By.id("org.wikipedia:id/page_list_item_container"),
//                "Cannot find search results",
//                2,
//                5
//        );
//
//        waitForElementAndClear(
//                By.id("org.wikipedia:id/search_src_text"),
//                "Cannot find search field",
//                5
//        );
//
//        waitForElementAndClick(
//                By.id("org.wikipedia:id/search_close_btn"),
//                "Cannot find X to cancel search",
//                5
//        );
//
//        waitForElementNotPresent(
//                By.id("org.wikipedia:id/search_close_btn"),
//                "X is still present on the page",
//                5
//        );
//
//    }
//
//    @Test
//    public void testSearchItemsTitle() {
//        waitForElementAndClick
//                (
//                        By.xpath("//*[contains(@text, 'Search Wikipedia')]"),
//                        "Cannot find Search Wikipedia input",
//                        5
//                );
//
//        waitForElementAndSendKeys(
//                By.xpath("//*[contains(@text,'Searchâ€¦')]"),
//                "Macbook",
//                "Cannot find search input",
//                5
//        );
//        assertItemsTitleContainsText(
//                By.id("org.wikipedia:id/page_list_item_title"),
//                "Element is not found",
//                "Macbook",
//                7
//        );
    }

    
    
    
    
    
    

    @After
    public void tearDown() {
        driver.quit();
    }

}