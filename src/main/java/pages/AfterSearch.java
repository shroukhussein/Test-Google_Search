package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AfterSearch extends BasePage{
    private By newKeyword=By.id("APjFqb");
    private By result=By.id("result-stats");
    private By nextPage=By.xpath("//span[contains(text(),'التالية')]");

    public AfterSearch(WebDriver driver) {
        super(driver);
    }
    public void deleteKeyword(){
        driver.findElement(newKeyword).clear();
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
    public boolean checkvisibilty(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(result));
        return true;
    }
    public void scrolldown(){
        JavascriptExecutor j= (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public SearchPage2 gotopage2(){

        driver.findElement(nextPage).click();
        return new SearchPage2(driver);
    }
}
