package flows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;

public class HomeFlow {
    private static WebElement element;

    public static void verifyStockLinkText(WebDriver obj) {
        element=HomePage.getStockLink(obj);
        String value = element.getText();
        System.out.print(value);
        //value.contains("stocks");
        Assert.assertEquals(value,"Stocks");
    }

    public static void verifyFeedbackLink(WebDriver obj) {
        element=HomePage.getFeedbackLink(obj);
        String value = element.getText();
        System.out.print(value);
        Assert.assertEquals(value,"Feedback");
        System.out.println("jenkins job configuration");
        System.out.println("jenkins job configuration");
        System.out.println("jenkins job configuration");
        System.out.println("jenkins job configuration");
         System.out.println("jenkins job configuration");
    }

}
