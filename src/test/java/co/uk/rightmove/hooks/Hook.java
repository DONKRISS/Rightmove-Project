package co.uk.rightmove.hooks;

import co.uk.rightmove.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager             // Extends is connecting Browser manager with hooks
{
    @Before          //@Before (io.cucumber.java) ensure that its the correct one you have selected.
    public void setup()

    {
        launchBrowser("chrome");    //code 8-14 opens the browser
    }
    // after that setup ( lunching chrome),
    @After
    public void tearDown()     // Code 16 to 20 instructs the hook to close the browser (Teardown)
    {
        closeBrowser();
    }
}
