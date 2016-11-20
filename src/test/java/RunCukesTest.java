/**
 * Created by rajen on 20/11/2016.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"C:\\Users\\rajen\\IdeaProjects\\temperatureConverter\\src\\test\\feature\\Conversion.feature"}
)
public class RunCukesTest {
}