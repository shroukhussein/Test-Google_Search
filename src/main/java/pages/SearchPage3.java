package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage3 extends BasePage{
    private By result=By.id("result-stats");
    private By suggestion=By.xpath("//table[@class='AaVjTc']");
    String numOfResult;
    public SearchPage3(WebDriver driver) {
        super(driver);
    }
    public String getResultinPage3(){
        numOfResult= driver.findElement(result).getText().split(" ")[4];
        return numOfResult;
    }
    public boolean checkSuggestion(){
            wait.until(ExpectedConditions.visibilityOfElementLocated(suggestion));
            return true;

    }
}
