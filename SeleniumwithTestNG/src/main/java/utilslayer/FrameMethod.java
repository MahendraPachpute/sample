package utilslayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baselayer.BaseClass;

public class FrameMethod extends BaseClass{
	
	public static WebDriver switchToChildFrameUsingIndex(int index) {
		return driver.switchTo().frame(index);
		
	}
	
	public static WebDriver switchToChildFrameUsingName(String nameid) {
	return driver.switchTo().frame(nameid);
	}
	
	public static WebDriver switchToFrameUsingWebElement(WebElement wb) {
		return driver.switchTo().frame(wb);
	} 
	
	public static WebDriver switchToDefaultContent() {
		return driver.switchTo().defaultContent();
	}
}


