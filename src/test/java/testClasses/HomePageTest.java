package testClasses;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import utility.Base;

public class HomePageTest extends Base {
	
	static HomePage hp;

	@Test
	public void verifyLogo() throws InterruptedException {
		hp=new HomePage();
		Thread.sleep(7000);
		Boolean act=hp.logo.isDisplayed();
		System.out.println(act);
		Thread.sleep(2000);
		Assert.assertEquals(true, act);
	}
	
	@Test
	public void verifySearchField() throws InterruptedException {
		hp=new HomePage();
		Thread.sleep(7000);
		Boolean act=hp.searchField.isDisplayed();
		System.out.println(act);
		Thread.sleep(2000);
		Assert.assertEquals(true, act);
	}
	
	@Test
	public void verifySearchButton() throws InterruptedException {
		hp=new HomePage();
		Thread.sleep(7000);
		Boolean act=hp.searchBtn.isDisplayed();
		System.out.println(act);
		Thread.sleep(2000);
		Assert.assertEquals(true, act);
	}
	
	@Test
	public void verifyItemCartButton() throws InterruptedException {
		hp=new HomePage();
		Thread.sleep(7000);
		Boolean act=hp.itemCart.isDisplayed();
		System.out.println(act);
		Thread.sleep(2000);
		Assert.assertEquals(true, act);
	}
}
