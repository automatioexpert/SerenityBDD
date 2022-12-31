package webelements;

import org.fluentlenium.core.Alert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

//import org.junit.runner.RunWith;




@RunWith(SerenityRunner.class)
public class HandlingAlert extends PageObject {
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Test
	public void mouseAction() throws InterruptedException {
		
		open();
	//	withAction().dragAndDropBy($("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"), 400,0);
	
	
		$("//input[@name='proceed']").click();
		//withAction().contextClick($("//a[contains(text(),'Colorpicker')]")).contextClick();
	org.openqa.selenium.Alert alert=	getAlert();
	//alert.sendKeys("anssksdsjdsdj");
	Thread.sleep(7000);
	System.out.println(alert.getText());
	alert.accept();
		Thread.sleep(3000);
		
	}

}
