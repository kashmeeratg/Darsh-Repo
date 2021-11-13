package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/arunb/Documents/eclipse-workspace/maven-workspace/bank-demo/src/main/resources/FeatureFiles/Homepage.feature", //path of feature file
		glue = {"StepDef"},
		plugin = {"html:Report/cucumber-html-report.html", 
				   "json:Report/cucumber-json-report.json","junit:Report/cucumber-junit-report.xml",
				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //to generate different report types
		dryRun=false,
		monochrome = true
		
					)
public class MyTestRunner {

}
