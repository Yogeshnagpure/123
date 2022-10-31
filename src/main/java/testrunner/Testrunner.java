package testrunner;




import org.junit.runner.RunWith;
import io.cucumber.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = {"C:\\Users\\HP\\eclipse-workspace\\MercuryProject2\\src\\main\\java\\feature\\DATAdriver.feature"},
		glue={"stepdefination"}, 
		plugin= {"pretty","html:index.html"},
		monochrome = true,
		publish = true,
		stepNotifications = true,
		dryRun = true 		
		)

public class Testrunner {

}

//plugin= {"pretty","html:index.html",}