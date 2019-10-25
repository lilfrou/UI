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

	/**
	 * Correct ID and different PW
	 */
	@Test
	public void thetestLoginScenario2() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement.sendKeys("sellinium@yopmail.com");
		myDynamicElement2.clear();
		myDynamicElement2.sendKeys("cellinium123");
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[span/@class='text-danger']")));

	}
	/**
	 * Correct ID and PW field is blank
	 */
	@Test
	public void thetestLoginScenario3() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement.sendKeys("sellinium@yopmail.com");
		myDynamicElement2.clear();
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[span/@class='text-danger']")));

	}

	/**
	 * Different ID / PW
	 */
	@Test
	public void thetestLoginScenario4() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement.sendKeys("sellinium123@yopmail.com");
		myDynamicElement2.clear();
		myDynamicElement2.sendKeys("selenium123");
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[span/@class='text-danger']")));

	}

	/**
	 * Different ID and correct PW
	 */
	@Test
	public void thetestLoginScenario5() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement.sendKeys("sellinium123@yopmail.com");
		myDynamicElement2.clear();
		myDynamicElement2.sendKeys("selenium");
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[span/@class='text-danger']")));

	}

	/**
	 * Different ID and PW field is blank
	 */
	@Test
	public void thetestLoginScenario6() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement.sendKeys("sellinium123@yopmail.com");
		myDynamicElement2.clear();
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[span/@class='text-danger']")));

	}

	/**
	 * ID/PW field are blank
	 */
	@Test
	public void thetestLoginScenario7() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement2.clear();
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 30)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[1][span/@class='text-danger']")));
		WebElement myDynamicElement5 = (new WebDriverWait(driver, 30)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[2][span/@class='text-danger']")));

	}

	/**
	 * ID field is blank and correct PW
	 */

	public void thetestLoginScenario8() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement2.clear();
		myDynamicElement2.sendKeys("cellinium");
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 30)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[1][span/@class='text-danger']")));

	}

	/**
	 * Id field is blank and different PW
	 */
	@Test
	public void thetestLoginScenario9() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));

		myDynamicElement.clear();
		myDynamicElement2.clear();
		myDynamicElement2.sendKeys("cellinium123");
		myDynamicElement3.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 30)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[1][span/@class='text-danger']")));

	}

	@Test
	/**
	 * Click the [パスワードお忘れですか？]
	 */
	public void thetestLoginScenario10() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p/a/small")));

		myDynamicElement.click();
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://front.visamane.jp/request/reset/password");
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a/img")));
		myDynamicElement3.click();

	}

	@Test
	/**
	 * Click the [パスワードお忘れですか？] ID Correct pop up + button ok working
	 */
	public void thetestLoginScenario11() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 90))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='text-navy']//small")));

		myDynamicElement.click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 90))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		myDynamicElement2.sendKeys("sellinium@yopmail.com");
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 90)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//form/button[@class='btn btn-primary block full-width m-b']")));
		myDynamicElement4.click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement5 = (new WebDriverWait(driver, 90)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div/div/button[@class='swal2-confirm swal2-styled']")));
		myDynamicElement5.click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 90))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a/img")));
		myDynamicElement3.click();
	}

	@Test
	/**
	 * Click the [パスワードお忘れですか？] ID inccorect
	 * 
	 */
	public void thetestLoginScenario12() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p/a/small")));

		myDynamicElement.click();
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		myDynamicElement2.sendKeys("sellinium123@yopmail.com");
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 100)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//form/button[@class='btn btn-primary block full-width m-b']")));
		myDynamicElement4.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement5 = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/span[@class='text-danger']")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 100))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a/img")));
		myDynamicElement3.click();

	}

	@Test
	/**
	 * Click the [パスワードお忘れですか？] ID format blank
	 */
	public void thetestLoginScenario13() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p/a/small")));

		myDynamicElement.click();
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		WebElement myDynamicElement4 = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//form/button[@class='btn btn-primary block full-width m-b']")));
		myDynamicElement4.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a/img")));
		myDynamicElement3.click();

	}

	/**
	 * Click [会員登録] button
	 */
	@Test
	public void thetestLoginScenario14() {
		driver.get("https://front.visamane.jp/admin/login");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/a")));
		myDynamicElement.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://visamane.jp/");
		driver.navigate().back();
	}

	@Test
	/**
	 * Click the [パスワードお忘れですか？] ID format invalid
	 * 
	 */
	public void thetestLoginScenario15() {
		driver.get("https://front.visamane.jp");

		WebElement myDynamicElement = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p/a/small")));

		myDynamicElement.click();
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		myDynamicElement2.sendKeys("d");
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 120)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//form/button[@class='btn btn-primary block full-width m-b']")));
		myDynamicElement4.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement5 = (new WebDriverWait(driver, 120))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div/span[@class='text-danger']")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a/img")));
		myDynamicElement3.click();

	}

	/**
	 * Click the outside of the popup Popup is colosed
	 * 
	 */
	@Test
	public void thetestLoginScenario16() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p/a/small")));
		myDynamicElement.click();
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

		myDynamicElement2.sendKeys("sellinium@yopmail.com");
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//form/button[@class='btn btn-primary block full-width m-b']")));
		myDynamicElement4.click();
		WebElement myDynamicElement6 = (new WebDriverWait(driver, 50))
				.until(ExpectedConditions.presenceOfElementLocated(
						By.xpath("//body/div[@class='swal2-container swal2-center swal2-fade swal2-shown']")));
		myDynamicElement6.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}

	@Test
	/**
	 * Check if the copyright is correct
	 */
	public void thetestLoginScenario17() {
		driver.get("https://front.visamane.jp");
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/p[@class='m-t']/small")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals(myDynamicElement.getText(), "Copyright 株式会社ウィルグループ © 2018");
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


