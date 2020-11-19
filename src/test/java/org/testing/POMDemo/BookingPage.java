package org.testing.POMDemo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends LibGlobal{
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement txtName;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "address")
	private WebElement txtAddress;
	
	@FindBy(id = "cc_num")
	private WebElement txtCreditNumber;
	
	@FindBy(id = "cc_type")
	private WebElement txtCreditType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement txtMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement txtYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	
	@FindBy(id = "cancel")
	private WebElement btnCancel;

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditNumber() {
		return txtCreditNumber;
	}

	public WebElement getTxtCreditType() {
		return txtCreditType;
	}

	public WebElement getTxtMonth() {
		return txtMonth;
	}

	public WebElement getTxtYear() {
		return txtYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
}
