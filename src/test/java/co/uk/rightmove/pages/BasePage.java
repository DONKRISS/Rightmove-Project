package co.uk.rightmove.pages;

import co.uk.rightmove.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager {
    public String BASE_URL = "https://www.rightmove.co.uk/";     //This would be the URL of the project
    public Select select;                                        //this would hve to be the org.openga.selenium.support.ui

    //we have to added the method here now

    public void launchURL()
    {
        driver .navigate().to(BASE_URL);  // instruction is to inform drive to go to the base url
    }
    public void selectByText(WebElement element,String text)
    {
        select = new Select(element);
        select .selectByVisibleText(text);
    }      // this code (method) from 17 - 21 would be used to select objects throughout the website or pages

    public void selectByValue(WebElement element,String value )        //this grouping of element are called parameterizing
    {
        select= new Select(element);
        select.selectByValue(value);
            }

            public  void selectByIndex(WebElement element, int index)
            {
                select=new Select(element);
                select.selectByIndex(index);

            }
}
