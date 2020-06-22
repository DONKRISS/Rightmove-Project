package co.uk.rightmove.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailpage extends BasePage
{
    public ProductDetailpage(WebDriver driver)                           // you must write this code for every page you create and its called a constructor
    {
        this.driver=driver;         //this is an object of driver
        PageFactory.initElements(driver,this);           //for everypage you must write this codes (8 -13  to keep the process moving .
    }
}
