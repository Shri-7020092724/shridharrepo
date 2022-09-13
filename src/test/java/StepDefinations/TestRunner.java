package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(cucumber.class)
@CucumberOptions(features="src/test/resources/fetures"   ,glue= {"StepDefinations"})

public class TestRunner {

}
