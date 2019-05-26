package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static WebElement element;

    private static By searchField = By.id("search_str");
    private static  By stocks = By.linkText("Stocks");
    private static By feedBack = By.linkText("Feedback");
    private static By logIn = By.linkText("Log In");
    private static By signUp = By.linkText("Sign Up");

    public static WebElement getSearchField(WebDriver obj) {
        element=obj.findElement(searchField);
        System.out.println("practice");
        return element;
    }
    public static WebElement getStockLink(WebDriver obj) {
        element=obj.findElement(stocks);
        return element;
    }
    public static WebElement getFeedbackLink(WebDriver obj) {
        element=obj.findElement(feedBack);
        return element;
    }
    public static WebElement getLogInLink(WebDriver obj) {
        element=obj.findElement(logIn);
        return element;
    }
    public static WebElement getSignUpLink(WebDriver obj) {
        element=obj.findElement(signUp);
        return element;
    }
}
