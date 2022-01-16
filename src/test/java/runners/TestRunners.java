package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue = {"stepdefinations"},
		snippets = SnippetType.CAMELCASE,
		plugin= {"html:target/reports/my-report.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false
		
		)

public class TestRunners {

}
