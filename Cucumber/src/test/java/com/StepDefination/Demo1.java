package com.StepDefination;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.When;

public class Demo1 extends BaseClass {
	
	@When("capture the title of page")
	public void capture_the_title_of_page() {

		BaseClass.Intialization("https://google.com");
		String a=driver.getTitle();
		System.out.println(a);
	   
	}

	@When("capture the url of page")
	public void capture_the_url_of_page() {

		BaseClass.Intialization("https://facebook.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
	

	}
	@When("capture the logo of page")
	public void capture_the_logo_of_page() {
		

		BaseClass.Intialization("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
