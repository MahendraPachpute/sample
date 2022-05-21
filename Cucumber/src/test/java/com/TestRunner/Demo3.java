package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"FeatureFileFolder/practise.feature"},
		glue= {"com.StepDefination"},
		monochrome=true,
		dryRun=false,
	tags= "not @Google"
	
		)




public class Demo3 {

}
