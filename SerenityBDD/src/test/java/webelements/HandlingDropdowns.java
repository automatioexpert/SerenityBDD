package webelements;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;

@RunWith(SerenityRunner.class)
public class HandlingDropdowns extends PageObject {
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Test
	public void webElementTest() throws InterruptedException {
		open();
		//find(By.id("searchLanguage")).selectByVisibleText("Eesti");
		//find(By.id("searchLanguage")).selectByValue("hi");
	List<WebElementFacade> values=findAll(By.tagName("option"));
		System.out.println("Total dd options are: "+values.size());
	
		for(WebElementFacade ele:values) {
			System.out.println(ele.getAttribute("lang"));
		}
		Thread.sleep(4500);
	}

}
