package co.uk.rightmove.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)                                     // you must write this code for every page you create and its called a constructor
    {
        this.driver = driver;         //this is an object of driver
        PageFactory.initElements(driver, this);                   //for everypage you must write this codes (8 -13  to keep the process moving .
    }

    @FindBy(id = "searchLocation")
    // this code tells selenium how to find an element on a page this can be by Tag,class, or name.
    private WebElement SearchField;                        // private or public does not matter but always leave it on private.
    @FindBy(css = ".optanon-allow-all.accept-cookies-button")
    //when using css, start the code with a dot and close any space in between with a dot//
    private WebElement acceptCookieButton;

    @FindBy(name = "minPrice")
    private WebElement MinPrice;

    @FindBy(css = ".btn.hero-btn")
    private WebElement forsaleButton;

    @FindBy(id = "radius")
    private WebElement search_radius;

    @FindBy(name = "maxPrice")
    private WebElement MaxPrice;

    @FindBy(id = "displayPropertyType")
    private WebElement PropertyType;

    @FindBy(id = "minBedrooms")
    private WebElement NoOfBedroomMin;

    @FindBy(id = "submit")
    private WebElement submitButton;

   @FindBy(id = "maxDaysSinceAdded")
   private WebElement WhenAddedToSite;




    public void selectNumberOfBeds(String beds)
    {
        selectByText(NoOfBedroomMin,beds);
    }




    public void selectPropertyType(String property)
    {
        selectByText(PropertyType,property);
    }


    public void enterLocationValue(String location) {
        SearchField.sendKeys(location);            // code 19 - 22 is aa method designed to work with code 16 -18.
        SearchField.click();

    }

    public void clickOncookieButton() {
        acceptCookieButton.click();
    }

    public void SelectMinimumPrice(String minimumPrice) {
        selectByText(MinPrice, minimumPrice);
    }

    public void SelectMaximumPrice(String maximumPrice) {
        selectByText(MaxPrice, maximumPrice);
    }

    public void clickOnForSaleButton() {
        forsaleButton.click();

    }
    public void selectWhenAddedToSite(String added)
    {
        selectByText(WhenAddedToSite,added);
    }

    public void selectSearchRadius(String SearchRadius) {
        selectByText(search_radius, SearchRadius);
    }

    public SearchResultPage clickonSubmitButton()
    {
        submitButton.click();
        return new SearchResultPage(driver);}

}