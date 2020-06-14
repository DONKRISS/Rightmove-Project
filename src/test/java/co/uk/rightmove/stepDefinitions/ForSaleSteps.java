package co.uk.rightmove.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSaleSteps {

    WebDriver driver;
    @Given("i navigate to Rightmove homepage")
    public void i_navigate_to_Rightmove_homepage() {

        //Enters the url
        //navigate to the url

        WebDriverManager.chromedriver().setup();
        //Launch a browser
        driver = new ChromeDriver();
        driver.navigate() .to("https://www.rightmove.co.uk/");

    }

    @Given("i enter {string} into search field")
    public void i_enter_into_search_field(String Location) {
        driver .findElement(By.id("searchLocation")).sendKeys(Location);

    }

    @Given("i click for rent button")
    public void i_click_for_rent_button() {
    }

    @When("i select {string} from Search radius for rent")
    public void i_select_from_Search_radius_for_rent(String string) {
    }

    @When("i select {string} from Price range for rent")
    public void i_select_from_Price_range_for_rent(String string) {
    }

    @When("i select {string} from No.of bedrooms for rent")
    public void i_select_from_No_of_bedrooms_for_rent(String string) {
    }

    @When("i select {string} from Property type for rent")
    public void i_select_from_Property_type_for_rent(String string) {
    }

    @When("i select {string} from Added to site")
    public void i_select_from_Added_to_site(String string) {
    }

    @When("i click on Find properties")
    public void i_click_on_Find_properties() {
    }

    @Then("the search for {string} is displayed for rent")
    public void the_search_for_is_displayed_for_rent(String string) {
    }

}
