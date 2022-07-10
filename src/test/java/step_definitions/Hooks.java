package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;



public class Hooks {



    @Before
    public void setUp()
    {
        System.out.println("This method will run before each test");
        Driver.get().manage().window().maximize();

    }
    @After
    public void tearDown(Scenario scenario)
    {
        if(scenario.isFailed()){
            final  byte[] screenshot= ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);// this will take screetshot as byte
            scenario.attach(screenshot,"image/png","screenshot");// attaching screenshot to my report
        }

    }

}
