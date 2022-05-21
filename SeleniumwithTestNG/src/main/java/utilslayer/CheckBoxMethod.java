package utilslayer;

import org.openqa.selenium.WebElement;

import Baselayer.BaseClass;

public class CheckBoxMethod extends BaseClass{
	
	static WebElement wb;
	public static boolean checkBoxDisplayed() {
		return wb.isDisplayed();
	}
	public static boolean checkBoxEnabled() {
		return wb.isEnabled();
	}
	
	public static void clickonCheckBox() {
		wb.click();
	}
	
	public static boolean checkBoxSelected() {
		return wb.isSelected();
	}
	
}
