package utilslayer;



import Baselayer.BaseClass;

public class AlertMethods extends BaseClass{
	
	public static void clickOnOkButton() {
		driver.switchTo().alert().accept();
	}

	public static void clickOnCancelButton() {
		driver.switchTo().alert().dismiss();
	}
	public static void enterDataInTextBox(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static String captureText() {
		return driver.switchTo().alert().getText();
		
	}
}
