package webelements;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

//import org.junit.runner.RunWith;




@RunWith(SerenityRunner.class)
public class MouseHover extends PageObject {
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Test
	public void mouseAction() throws InterruptedException {
		
		open();
		withAction().moveToElement($("//span[contains(text(),'All Courses')]")).perform();
		$("//span[contains(text(),'Lifetime Membership')]").click();
		
		Thread.sleep(3000);
		
	}

}
