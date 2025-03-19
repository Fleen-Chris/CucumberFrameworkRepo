package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/LoginPage.feature"},  tags="@positive or @negative",
glue = {"stepDefinitions"}, monochrome = true, dryRun = false,
publish = true)

public class LeafTapsTCOne extends AbstractTestNGCucumberTests{

}
