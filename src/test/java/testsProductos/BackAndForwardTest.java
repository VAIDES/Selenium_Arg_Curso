package testsProductos;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonSteps.CommonSteps;
import pages.DressPage;

public class BackAndForwardTest extends CommonSteps{
	
	@Test(description="adelante y atras con women", priority=3)
	
	public void womenForwardAndBack() {
		
		indexPage.clickWomenLink();
		Assert.assertEquals("WOMEN ", womenPage.getCategoryText(),"Deberia estar en la seccion Women");
		driver.navigate().back();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php");
		driver.navigate().forward();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_category=3&controller=category");
		Assert.assertTrue(driver.getCurrentUrl().toString().contains("http://automationpractice.com/index.php?id_category=3"));
	}

	
     @Test(description="adelante y atras con Dress para ver si esta Ok ", priority=3)
	
	public void dressForwardAndBack() {
		
		indexPage.clickDressLink();
		Assert.assertEquals("DRESSES ", dressPage.getCategoryText(),"Deberia estar en la seccion Dresses");
		driver.navigate().back();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php");
		driver.navigate().forward();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_category=8&controller=category");
		Assert.assertTrue(driver.getCurrentUrl().toString().contains("http://automationpractice.com/index.php?id_category=8"));
	}

	
}
