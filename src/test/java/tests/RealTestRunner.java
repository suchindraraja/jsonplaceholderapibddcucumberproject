package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature2.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature3.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature4.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature5.feature"},
				 monochrome=true,
				 glue= {"glue"},
				 plugin= {"pretty","html:target\\realtestresults","rerun:target\\realtestfailed.txt"}
				)
public class RealTestRunner 
{
}