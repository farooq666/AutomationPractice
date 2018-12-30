package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flows.SubscriptionFlow;

import java.util.concurrent.TimeUnit;

public class SubscriptionTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\E004146\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.moneycontrol.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void clickSubscriptionLink()
    {
        SubscriptionFlow.verifySubscriptionLink(driver);
    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }
}
