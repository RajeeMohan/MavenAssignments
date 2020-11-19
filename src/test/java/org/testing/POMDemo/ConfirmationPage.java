package org.testing.POMDemo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends LibGlobal {
	
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "search_hotel")
	private WebElement btnSearch;
	
	@FindBy(id = "my_itinerary")
	private WebElement btnMyItinerary;
	
	@FindBy(id = "logout")
	private WebElement btnLogout;

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}
	
}
