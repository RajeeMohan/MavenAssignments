package org.testing.POMDemo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends LibGlobal {
	
	public SelectPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement txtLocation;
	
	@FindBy(id = "hotels")
	private WebElement txtHotels;
	
	@FindBy(id = "room_type")
	private WebElement txtRoomType;
	
	@FindBy(id = "room_nos")
	private WebElement txtRoomNumber;
	
	@FindBy(id = "datepick_in")
	private WebElement txtDateIn;
	
	@FindBy(id = "datepick_out")
	private WebElement txtDateOut;
	
	@FindBy(id = "adult_room")
	private WebElement txtAdultRoom;
	
	@FindBy(id = "child_room")
	private WebElement txtChildRoom;
	
	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtHotels() {
		return txtHotels;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtRoomNumber() {
		return txtRoomNumber;
	}

	public WebElement getTxtDateIn() {
		return txtDateIn;
	}

	public WebElement getTxtDateOut() {
		return txtDateOut;
	}

	public WebElement getTxtAdultRoom() {
		return txtAdultRoom;
	}

	public WebElement getTxtChildRoom() {
		return txtChildRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
}
