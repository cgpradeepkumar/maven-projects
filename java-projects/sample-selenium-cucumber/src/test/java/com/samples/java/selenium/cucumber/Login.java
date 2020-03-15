package com.samples.java.selenium.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
	WebDriver driver;

	@Before
	public void setup_firefox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cgpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws InterruptedException {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}

	@Given("^I open Google search page$$")
	public void user_navigates_to_Google_website() throws Throwable {
		driver.get("http://google.com/");
		System.out.println("testing......................................................");
	}

	@Then("^the title is (.*?)$")
	public void title_of_page(String title) throws Throwable {
		Thread.sleep(2000);
		System.out.println(title + "............................................." + driver.getTitle());
	}

	@Then("do Google search for (.*?)$")
	public void do_search(String keyword) throws Throwable {
		System.out.println(keyword);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(".//*[@name='q']"));
		element.sendKeys(keyword);
		element.submit();
	}
}
