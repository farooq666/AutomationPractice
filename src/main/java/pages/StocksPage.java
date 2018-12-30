package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StocksPage {

    private static WebElement element;

    private static By stocksLink = By.linkText("Stocks");


    public  WebElement clickStocksLink(WebDriver obj)
    {
        element = obj.findElement(stocksLink);
        return element;
    }
}
