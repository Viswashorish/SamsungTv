package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	
	WebDriver driver;
	
	LandingPage_PageObject landing;
	
	OffersPage_PageObject offers;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage_PageObject landingPage()
	{
		landing = new LandingPage_PageObject(driver);
		
		return landing;
	}
	
	public OffersPage_PageObject offersPage()
	{
		offers = new OffersPage_PageObject(driver);
		
		return offers;
		
		//this is Supriya
		//Mastee is the latest one
		//Naa peru Viswanadh 9:48 , Nalagonda, Neenu machivadini, naa jolukostey bagundadu
	}

}
