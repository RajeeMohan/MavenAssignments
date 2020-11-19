package org.testing.JUnitDemo;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.LibGlobal;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JUnitSample extends LibGlobal {
@SuppressWarnings("deprecation")
@Test
public void method() throws IOException {
	browserLaunch();
	enterUrl("http://adactinhotelapp.com/SearchHotel.php");
	File f = new File("C:\\Users\\Ziva Nandhini\\Desktop\\selenium\\Excel\\adactin_dataset.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sh  = workbook.getSheet("Sheet1");
	Row r = sh.getRow(1);
	Cell c = r.getCell(0);
	WebElement txtUsername = driver.findElement(By.id("username"));
	sendKeys(txtUsername, c.getStringCellValue().toString());
	Assert.assertEquals(c.getStringCellValue().toString(), "karthi");
	c = r.getCell(1);
	WebElement txtPasswrd = driver.findElement(By.id("password"));
	sendKeys(txtPasswrd, c.getStringCellValue().toString());
	Assert.assertEquals(c.getStringCellValue().toString(), "Karthi007");
	WebElement btnLogin = driver.findElement(By.id("login"));
	buttonClick(btnLogin);
	implicityWait(100);
	c = r.getCell(2);
	WebElement txtLocation = driver.findElement(By.id("location"));
	selectByValue(txtLocation,c.getStringCellValue().toString());
	c = r.getCell(3);
	WebElement txtHotels = driver.findElement(By.id("hotels"));
	selectByValue(txtHotels, c.getStringCellValue().toString());
	c = r.getCell(4);
	WebElement txtRoomType = driver.findElement(By.id("room_type"));
	selectByValue(txtRoomType, c.getStringCellValue().toString());
	c = r.getCell(5);
	WebElement txtRoomNum = driver.findElement(By.id("room_nos"));
	selectByVisibleText(txtRoomNum, c.getStringCellValue().toString());
	c = r.getCell(6);
	WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
	sendKeys(txtCheckIn, c.getStringCellValue().toString());
	c = r.getCell(7);
	WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
	sendKeys(txtCheckOut, c.getStringCellValue().toString());
	c = r.getCell(8);
	WebElement txtAdult = driver.findElement(By.id("adult_room"));
	selectByVisibleText(txtAdult, c.getStringCellValue().toString());
	c = r.getCell(9);
	WebElement txtChild = driver.findElement(By.id("child_room"));
	selectByVisibleText(txtChild, c.getStringCellValue().toString());
	WebElement btnSearch = driver.findElement(By.id("Submit"));
	buttonClick(btnSearch);

}
}
