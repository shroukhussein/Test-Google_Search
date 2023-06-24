package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AfterSearch;
import pages.SearchPage2;
import pages.SearchPage3;

public class TestSearch extends BaseTest{
    AfterSearch search;
    SearchPage2 page2;
    SearchPage3 page3;
    String resPage2;
    String resPage3;
    SoftAssert sa=new SoftAssert();
    @Test
    public void validateSearch(){
        home.enterKeyword("buss");
        search=home.clickEnter();
        search.deleteKeyword();
        home.enterKeyword("Foodics");
        search=home.clickEnter();
        Assert.assertTrue(search.checkvisibilty());
        search.scrolldown();
        page2=search.gotopage2();
        resPage2= page2.getResultinPage2();
        page3=page2.gotopage3();
        resPage3=page3.getResultinPage3();
        sa.assertEquals(resPage2,resPage3);
        Assert.assertTrue(page3.checkSuggestion());

    }
}
