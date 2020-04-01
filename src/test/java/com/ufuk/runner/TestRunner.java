package com.ufuk.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue = {"com.ufuk.test"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"})
public class TestRunner {


}
