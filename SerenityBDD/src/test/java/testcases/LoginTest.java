package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.PageObject;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

	@Managed(driver="chrome")
	WebDriver driver;
	
	
	@FindBy(name="q")
	WebElement googleSearch;
	
	@Title("Executing Login test")
	@Test
	public void doLogin() throws InterruptedException {
		open();
		//setImplicitTimeout(10, null);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("Serenity "+Keys.ENTER);
		//getDriver().findElement(By.name("q")).sendKeys("Serenity "+Keys.ENTER);
		
	//$("//*[@name='q']").sendKeys("Serenity "+Keys.ENTER);
	//typeInto($("//*[@name='q']"),"Serenity");
	//typeInto(googleSearch,"Serenity");	
		
	WebElementFacade textBox=find(By.name("q"));
	textBox.typeAndEnter("Serenity world !!!!!");
	textBox.shouldBePresent();
	Thread.sleep(3000);
	
	
	}
}
