package co.uk.rightmove.stepDefinitions;

import co.uk.rightmove.pages.BasePage;
import co.uk.rightmove.pages.HomePage;
import co.uk.rightmove.pages.ProductDetailpage;
import co.uk.rightmove.pages.SearchResultPage;
import io.cucumber.core.gherkin.Location;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ForSaleStep extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver,SearchResultPage.class);  //introcuces the search result page created from homepage
    ProductDetailpage productDetailpage = PageFactory.initElements(driver,ProductDetailpage.class);


    @Given("i navigate to Rightmove homepage")
    public void i_navigate_to_Rightmove_homepage() {
        homePage.launchURL();

    }

    @Given("i enter {string} into search field")
    public void i_enter_into_search_field(String Location) {
        driver .findElement(By.id("searchLocation")).sendKeys(Location);

    }

    @Given("i click for rent button")
    public void i_click_for_rent_button() {
        homePage.clickOnForSaleButton();

    }

    @When("i select {string} from Search radius for sale")
    public void i_select_from_Search_radius_for_sale(String SearchRadius) {
       homePage.selectSearchRadius(SearchRadius);
    }

    @When("i select {string} from minPrice range for sale")
    public void i_select_from_MinPrice_range_for_sale(String MinPrice) {
        homePage.SelectMinimumPrice(MinPrice);
    }

    @When("i select {string} from maxPrice range for sale")
    public void i_select_from_maxPrice_range_for_sale(String MaxPrice) {
        homePage.SelectMaximumPrice(MaxPrice);
    }


    @When("i select {string} from No.of bedrooms for sale")
    public void i_select_from_No_of_bedrooms_for_sale(String beds) {
        homePage.selectNumberOfBeds(beds);

    }

    @When("i select {string} from Property type for sale")
    public void i_select_from_Property_type_for_sale(String property) {
        homePage.selectPropertyType(property);

    }

    @When("i select {string} from Added to site")
    public void i_select_from_Added_to_site(String added) {
        homePage.selectWhenAddedToSite(added);

    }

    @When("i click on Find properties")
    public void i_click_on_Find_properties() {
        searchResultPage = homePage.clickonSubmitButton();  // this is a handshake or exchange or batten btw pages and codes

    }


    @Then("i click on one of the search results")
    public void i_click_on_one_of_the_search_results() {

       // productDetailpage=searchResultPage.clickOnTheFirstResult();
        productDetailpage = searchResultPage.clickOnAnyResult();

    }
}
