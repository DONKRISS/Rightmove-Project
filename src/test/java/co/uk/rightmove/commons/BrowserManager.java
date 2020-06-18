package co.uk.rightmove.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import sun.security.mscapi.CPublicKey;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager         //this is used to extend the DriverManager class
{
    private WebDriver initChrome()                       //this code open browser
    {
        WebDriverManager.chromedriver().setup();         // this code setup chrome browser in selenium
        return new ChromeDriver();                     //this ode helps us flash our chrome driver
    }
    // code 10 to 14 gives you codes that can be seen when ran, eg chrome browser opens up.

    private WebDriver initHeadlessChrome()               //this code open HeadlessChrome browser //headlessChrome is very fast and in jenkins,it would behind the scene.
    {
        WebDriverManager.chromedriver().setup();            // this code setup chrome browser in selenium

        ChromeOptions options = new ChromeOptions();         //instantiation
        options .addArguments("--disable-gpu","-headless");  //this code removes the graphics the browser

        return new ChromeDriver(options);                           //this code helps us flash our chrome driver

        //code 16 to 23 gives you the code that can not be seen when it runs



    }

// we would repeat same process lines 10 to line 24 for any other chosen browser from the Browser manager.

    private WebDriver initFirefox()                       //this code open browser
    {
        WebDriverManager.firefoxdriver().setup();         // this code setup chrome browser in selenium
        return new FirefoxDriver();                     //this ode helps us flash our chrome driver
    }
    // code 10 to 14 gives you codes that can be seen when ran, eg chrome browser opens up.

    private WebDriver initHeadlessFirefox()               //this code open HeadlessFirefox browser //headlessChrome is very fast and in jenkins,it would behind the scene.
    {
        WebDriverManager.firefoxdriver().setup();            // this code setup chrome browser in selenium

        FirefoxOptions options = new FirefoxOptions();         //instantiation
        options .addArguments("--disable-gpu","-headless");  //this code removes the graphics the browser

        return new FirefoxDriver(options);                           //this code helps us flash our chrome driver

        //code 43 to 50 gives you the code that can not be seen when it runs


    }
    //i need to write a method for it to be used at different times. below is how

    public void launchBrowser(String browser)
    {
        switch (browser)
        {
            case "chrome":
                    driver = initChrome();
                    break;
            case "HeadlessChrome":
                driver = initHeadlessChrome();
                break;
            case "Firefox":
                driver = initFirefox();
                        break;
            case "HeadlessFirefox":
                driver = initHeadlessFirefox();
                break;
            default:
                driver = initHeadlessChrome();
                break;

                // code 59 to 77 helps selenium to switch between the available browser.
        }
        driver.manage().window().maximize();   //this code instructs driver to manage browser when its open and maximize it.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //this code tell the driver to delay for 10 sec once its open
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);  // this coe tell the driver to timeout after .30 sec of waiting on that page
    }

    // the method below is to ask selenium to close the browser after it has performed the tasks about

        public void closeBrowser()

        {
            driver.manage().deleteAllCookies(); // this code delete all cookies becos we want each text to be unique
            driver .quit();
        }


}
