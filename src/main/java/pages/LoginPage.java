package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement element;
    private By logInLink = By.linkText("Log In");

    public WebElement getLogInLink(WebDriver obj) {
        element =  obj.findElement(logInLink);
        return element;
    }
}
