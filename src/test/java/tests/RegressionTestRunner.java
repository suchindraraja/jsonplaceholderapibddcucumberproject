package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature1.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature3.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature4.feature",
							"E:\\Automation\\AutomationNested\\com.bddcucumber.api\\src\\test\\resources\\features\\feature5.feature"},
				 monochrome=true,
				 tags= {"@regression"},
				 glue= {"glue"},
				 plugin= {"pretty","html:target\\regressionresults","rerun:target\\regressionfailed.txt"}
				)
public class RegressionTestRunner
{
}