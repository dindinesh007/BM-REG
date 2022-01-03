package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BarathMatrimonyReg.feature",
glue="org.stepDefinition",
dryRun=false)
public class BharathRegRunner {

}
