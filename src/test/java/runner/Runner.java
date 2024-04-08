package runner;

import io.cucumber.testng.CucumberOptions;
import projectSpecification.BaseClass;


@CucumberOptions(features="src/test/java/feature/Saucedemo.feature", glue="pages", monochrome = true, publish = true)
public class Runner extends BaseClass {

}
