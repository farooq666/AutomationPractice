package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

    private static WebElement element;

    private By signUpLInk = By.linkText("Sign Up");

    public  WebElement clickSignUpLink(WebDriver obj) {
        element = obj.findElement(signUpLInk) ;
        return element;
    }
}
