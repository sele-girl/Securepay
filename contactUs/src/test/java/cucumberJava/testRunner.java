package cucumberJava;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = "cucumberJava"
		,glue= {"stepdefinition"}
		,format = {"pretty", "html:target/cucumber"} 
		,dryRun=false)
public class testRunner {
	
}