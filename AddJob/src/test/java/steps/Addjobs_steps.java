package steps;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addjobs_steps {
	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Add_Job\\AddJob\\src\\test\\java\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

	}
//
//	@After()
//	public void end() {
//		driver.manage().deleteAllCookies();
//		driver.quit();
//	}

	@When("^user enters the platform$")
	public void user_enters_the_platform() throws Throwable {
		// user login
		driver.get("http://20.52.44.20/auth/login");
		driver.findElement(By.id("InputEmail")).sendKeys("testing.amalitech@gmail.com");
		driver.findElement(By.id("InputPassword1")).sendKeys("12345678!Aa");
		driver.findElement(By.id("signin_button")).click();
	}

	@When("^user selects add job$")
	public void user_selects_add_job() throws Throwable {
		Thread.sleep(5000);
		// click on job dropdown
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div[2]/a/span")).click();
		Thread.sleep(3000);
		// click on add job from dropdown
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div[2]/div/a[1]")).click();
	}

	@When("^user completes all fields$")
	public void user_completes_all_fields() throws Throwable {

		// add job title
		Thread.sleep(3000);
		driver.findElement(By.id("job_title_txt")).sendKeys("IT Specialist");

		// job location
		Thread.sleep(2000);
		Select location = new Select(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[3]/div[2]/div[1]/select")));
		location.selectByVisibleText("Lagos Twn");
		

		// salary from
//		Thread.sleep(2000);
		driver.findElement(By.id("job_salary1_txt")).sendKeys("4,000");

		// salary to
		driver.findElement(By.id("job_salary2_txt")).sendKeys("4,500");

		// description
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"job_description_txt\"]/textarea")).sendKeys("software test engineer needed on a full time basis");

		// Fill date as mm/dd/yyyy as 09/25/2013
		Thread.sleep(3000);
		WebElement dateBox = driver.findElement(By.id("job_exdate_txt"));
		Thread.sleep(2000);
		dateBox.sendKeys("12102020");

		// select type
		Thread.sleep(2000);
//		Select type = 
		new Select(driver.findElement(By.id("job_type_txt"))).selectByVisibleText("Full-Time");
//		type.selectByVisibleText("Full-Time");

		// select category
		Thread.sleep(2000);
		Select category = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[3]/div[1]/div[4]/select")));
		category.selectByVisibleText("engineering");
	}

	@When("^user clicks post$")
	public void user_clicks_post() throws Throwable {
		// click post to post the job
		Thread.sleep(2000);
		driver.findElement(By.id("job_save_btn")).click();
	}

	@Then("^user should receive a notification of success$")
	public void user_should_receive_a_notification_of_success() throws Throwable {
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/div[1]/p")).getText();
		Assert.assertEquals("Job posted successfully", message);
	}
	
	
}
