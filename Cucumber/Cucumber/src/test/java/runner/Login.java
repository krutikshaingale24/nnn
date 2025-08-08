package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "C:\\Users\\acer\\IdeaProjects\\Cucumber\\src\\test\\resources\\Feature\\Login.feature",
    glue = {"StepDefination"},

//        glue = {"abc", "Hooks"}
// dryRun = true,

     plugin = {"pretty","html:target/cucumber-report.html"},

      monochrome = true,
        tags = "not @smoke")
public class Login {
}
