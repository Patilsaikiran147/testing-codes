package package1;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "Login.feature", tags = { "@login1"})

public class LoginTestRunner {

}
