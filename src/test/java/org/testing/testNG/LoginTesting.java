package org.testing.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTesting {
	
	@Parameters({"username","password"})
	@Test
	private void loginPage() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ziva Nandhini\\eclipse-workspace\\MavenAssignments\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("karthi007");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Karthi@1989");
		WebElement btnSubmit = driver.findElement(By.id("login"));
		btnSubmit.click();

	}

}