package org.testing.testNG;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectTesting extends LibGlobal {
	@Parameters({"location","hotels","room_type","room_nos","datepick_in","datepick_out","adult_room","child_room"})
	@Test
	private void selectTesting() {
		
		WebDriver driver = new ChromeDriver();
		WebElement txtLocation = driver.findElement(By.id("location"));
		selectByVisibleText(txtLocation, "Brisbane");
		WebElement txtHotels = driver.findElement(By.id("hotels"));
		selectByVisibleText(txtHotels,"Hotel Sunshine");
		WebElement txtRoomType = driver.findElement(By.id("room_type"));
		selectByVisibleText(txtRoomType,"Deluxe");
		WebElement txtRoomNumber = driver.findElement(By.id("room_nos"));
		selectByVisibleText(txtRoomNumber,"1 - One");
		WebElement txtDateIn = driver.findElement(By.id("datepick_in"));
		txtDateIn.sendKeys("07/11/2020");
		WebElement txtDateOut = driver.findElement(By.id("datepick_out"));
		txtDateOut.sendKeys("09/11/2020");
		WebElement txtAdultRoom = driver.findElement(By.id("adult_room"));
		selectByVisibleText(txtAdultRoom,"2 - Two");
		WebElement txtChildRoom = driver.findElement(By.id("child_room"));
		selectByVisibleText(txtChildRoom,"1 - One");
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();

	}

}
