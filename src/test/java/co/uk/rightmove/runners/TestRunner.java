package co.uk.rightmove.runners;

//In this test runner, we are not going to do anything here. this is the only time you are allowed to write outside the brackets


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
     features =   {"src/test/java/co/uk/rightmove/features"},
        glue ={"co/uk/rightmove/hooks","co/uk/rightmove/stepDefinitions"},
        plugin = {"pretty","json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/Pretty-cucumber"}     // instruction to report pretty using json and storing it in reports using monochromata


        // pretty report: this is a human readable report
        // inside cucumberOption, you would need to copy features Patch and paste inside he cucumber options from "src and end @ Features . do the same for hooks and step defination
)
public class TestRunner {
}



//Test runner is used to specify where our feature , glue (step definations) Plugins files are.