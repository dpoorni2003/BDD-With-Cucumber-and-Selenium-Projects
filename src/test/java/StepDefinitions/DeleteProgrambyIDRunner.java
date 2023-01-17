package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/DeleteProgram.feature",
		glue="StepDefinitions",
		monochrome=true,
		plugin = {"summary", "pretty",
		"html:target/HTMLReports/htmlreports.html",
		"json:target/JSONReports/reports.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
 

public class DeleteProgrambyIDRunner {
		

}
