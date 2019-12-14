package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import helpers.Waiters;

public class IndexPage {
	private By womanLink;
	private By dressLink;
	private By tshirtLink;
	private WebDriver driver;
	private Waiters waiter;
	
	public IndexPage(WebDriver driver) {
		this.driver = driver;
		womanLink = By.linkText("Women");
		dressLink = By.linkText("Dresses");
		tshirtLink = By.linkText("T-shirts");
		
		waiter = new Waiters(this.driver,5);
	}
	
	public void clickWomenLink() {
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement womanButton = wait.until(ExpectedConditions.elementToBeClickable(womanLink));*/
		//Waiters waiter = new Waiters(driver,5);
		
		WebElement womanButton = waiter.waitForClickable(womanLink);
		//driver.findElement(womanLink).click();
		womanButton.click(); //TODO: why this if you can do something else
	}
	
	public void clickDressLink() {
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement womanButton = wait.until(ExpectedConditions.elementToBeClickable(womanLink));*/
		//Waiters waiter = new Waiters(driver,5);
		
		WebElement dressButton = waiter.waitForClickable(dressLink);
		//driver.findElement(womanLink).click();
		dressButton.click(); //TODO: why this if you can do something else
	}
	
	public void TshirtLink() {
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement womanButton = wait.until(ExpectedConditions.elementToBeClickable(womanLink));*/
		//Waiters waiter = new Waiters(driver,5);
		
		WebElement TshirtButton = waiter.waitForClickable(tshirtLink);
		//driver.findElement(womanLink).click();
		TshirtButton.click(); //TODO: why this if you can do something else
	}
	
}
