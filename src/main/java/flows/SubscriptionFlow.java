package flows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.SubscriptionPage;

import java.util.List;
import java.util.Random;

public class SubscriptionFlow {



    public static void verifySubscriptionLink(WebDriver obj)
    {
        SubscriptionPage.clickSubscriptionLink(obj);
        String url = obj.getCurrentUrl();
        Assert.assertTrue(url.contains("Subscription"));
        List<WebElement> ele = SubscriptionPage.getListOfAreaOfInterest(obj);
        int num = getRandomNumber(ele.size());
        WebElement b =SubscriptionPage.clickSpecificCheckbox(obj,num);
        b.click();

    }

    public static int getRandomNumber(int size)
    {
        int number;
        Random a = new Random();
        number= a.nextInt(size-1);
        return number;
    }
}
