package co.uk.rightmove.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)                           // you must write this code for every page you create and its called a constructor
    {
        this.driver=driver;         //this is an object of driver
        PageFactory.initElements(driver,this);           //for everypage you must write this codes (8 -13  to keep the process moving .
    }

    public void isSearchResultPageDisplayed(String  location)   //this code to verify that he searched result is correct
    {
        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.contains(location));
    }
    @FindBy(tagName = "hi")
    private WebElement pageTitle;


    public void  doesPageTitleContains(String location)
    {
        String title = pageTitle.getText();
        Assert.assertTrue(title.contains(location));   //ths is is the code to ensure that the page shows the location
    }
}
