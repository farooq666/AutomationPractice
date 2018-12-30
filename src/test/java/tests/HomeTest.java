package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import flows.HomeFlow;

import java.util.concurrent.TimeUnit;

public class HomeTest {
    public WebDriver driver;

    @BeforeSuite
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","G:\\Download_Stuff\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.moneycontrol.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void verifyStockLink()
    {
     HomeFlow.verifyStockLinkText(driver);
    }

    @Test
    public void verifyFeedbackLink(){
        HomeFlow.verifyFeedbackLink(driver);
    }

    @AfterSuite
    public void close()
    {
        driver.close();
    }
}
