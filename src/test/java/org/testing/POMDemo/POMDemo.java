package org.testing.POMDemo;

import org.base.LibGlobal;

public class POMDemo extends LibGlobal {
	public static void main(String[] args) {
		browserLaunch();
		enterUrl("http://adactinhotelapp.com/SearchHotel.php");
		
		Login l = new Login();
		sendKeys(l.getTxtUsername(), "karthi007");
		sendKeys(l.getTxtPassword(), "Karthi@1989");
		buttonClick(l.getBtnSubmit());
		
		SelectPage s = new SelectPage();
		selectByVisibleText(s.getTxtLocation(), "Brisbane");
		selectByVisibleText(s.getTxtHotels(), "Hotel Sunshine");
		selectByVisibleText(s.getTxtRoomType(), "Deluxe");
		selectByVisibleText(s.getTxtRoomNumber(), "1 - One");
		sendKeys(s.getTxtDateIn(), "31/10/2020");
		sendKeys(s.getTxtDateOut(), "01/11/2020");
		selectByVisibleText(s.getTxtAdultRoom(), "2 - Two");
		selectByVisibleText(s.getTxtChildRoom(), "1 - One");
		buttonClick(s.getBtnSubmit());
		
		HotelSelect hs = new HotelSelect();
		buttonClick(hs.getBtnRadio());
		buttonClick(hs.getBtnContinue());
		
		BookingPage bp = new BookingPage();
		sendKeys(bp.getTxtName(), "Rajee");
		sendKeys(bp.getTxtLastName(), "Mohan");
		sendKeys(bp.getTxtAddress(), "AVADI");
		sendKeys(bp.getTxtCreditNumber(), "9677142356891211");
		selectByVisibleText(bp.getTxtCreditType(), "VISA");
		selectByVisibleText(bp.getTxtMonth(), "January");
		selectByVisibleText(bp.getTxtYear(), "2022");
		sendKeys(bp.getTxtCVV(), "113");
		buttonClick(bp.getBtnBookNow());
		
		implicityWait(100);
		
		ConfirmationPage cp = new ConfirmationPage();
		buttonClick(cp.getBtnLogout());
	}
}
