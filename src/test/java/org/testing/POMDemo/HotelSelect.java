package org.testing.POMDemo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelect extends LibGlobal{
	
	public HotelSelect() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement btnRadio;
	
	@FindBy(id = "continue")
	private WebElement btnContinue;
	
	@FindBy(id = "cancel")
	private WebElement btnCancel;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	
}
