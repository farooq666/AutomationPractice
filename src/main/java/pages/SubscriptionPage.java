package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubscriptionPage {

    private static WebElement element;

    private static By subscriptionLink = By.linkText("Subscription");
    private static By areaOfInterest = By.xpath("//ul[@class='checklistmcp dropdown-menu']//li");

    public static WebElement clickSubscriptionLink(WebDriver obj) {
        element=obj.findElement(subscriptionLink);
        return element;

    }

    public static List<WebElement> getListOfAreaOfInterest(WebDriver obj){
        List<WebElement> elementList=obj.findElements(areaOfInterest);
        return elementList;
    }

    public static WebElement clickSpecificCheckbox(WebDriver obj,int number){
       WebElement a = obj.findElement(By.xpath("//ul[@class='checklistmcp dropdown-menu']//li[number]"));
       return a;
    }
}
