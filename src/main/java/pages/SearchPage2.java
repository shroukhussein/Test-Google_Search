package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage2 extends BasePage{
    private By result=By.id("result-stats");
    private By nextPage=By.xpath("//span[contains(text(),'التالية')]");

    String numOfResult;
    public SearchPage2(WebDriver driver) {
        super(driver);
    }
    public String getResultinPage2(){
        numOfResult= driver.findElement(result).getText().split(" ")[4];
        return numOfResult;
    }
    public SearchPage3 gotopage3(){
        driver.findElement(nextPage).click();
        return new SearchPage3(driver);
    }
}
