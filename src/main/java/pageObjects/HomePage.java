package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;

public class HomePage extends Base{
	
	@FindBy(xpath="//img[@title=\"Your Store\"]") public WebElement logo;
	@FindBy(xpath="//input[@name=\"search\"]") public WebElement searchField;
	@FindBy(xpath="//input[@name=\"search\"]/following-sibling::button") public WebElement searchBtn;
	@FindBy(xpath="//*[contains(text(),\"item\")]") public WebElement itemCart;
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
}
