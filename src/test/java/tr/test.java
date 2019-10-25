package tr;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	WebDriver driver = null;
	WebDriverWait wait;

	/**
	 * // * @author mhennifiras && Ziedbensalem // * // * // * //
	 */

	@BeforeTest
	public void setuptest() {

		 //System.setProperty("webdriver.chrome.driver", "/home/firas/Téléchargements/chromedriver_linux64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/home/zied/Téléchargements/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/workspace/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		driver = new ChromeDriver(options);

	}

	/**
	 * Correct ID / PW
	 */
	@Test
	public void thetestLoginScenario1() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement.sendKeys("sellinium@yopmail.com");
		myDynamicElement2.clear();
		myDynamicElement2.sendKeys("cellinium");
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li/a[i/@class='fa fa-sign-out']")));

		myDynamicElement4.click();

		// assertEquals(driver.getCurrentUrl(),
		// "https://front.visamane.jp/vm/company/dashboard");

	}
	@AfterTest
	public void killtestLoginScenario() {
		driver.close();
	}

}
//try {
// Thread.sleep(3000);
// } catch (InterruptedException e) {
// TODO Auto-generated catch block
// e.printStackTrace();
// }


