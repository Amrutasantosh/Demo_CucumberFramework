package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:/Users/rushi/OneDrive/Desktop/BDD_Cucumber/Banking_Application_Demo/src/test/resources/Features"},
glue= {"Step_Definitions"},
monochrome =true,
dryRun=false,
plugin={"pretty","junit:target/JunitReport/Junit_report.xml"
		,"html:target/Html_Reports"
		,"json:target/JSONReports/Report.json"})

		

public class Test_Runner {

}
