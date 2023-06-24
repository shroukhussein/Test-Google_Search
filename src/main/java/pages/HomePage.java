package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private By searchText=By.id("APjFqb");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void enterKeyword(String keyword){
        driver.findElement(searchText).sendKeys(keyword);

    }
    public AfterSearch clickEnter(){
        driver.findElement(searchText).sendKeys(Keys.ENTER);
        return new AfterSearch(driver);
    }
}
