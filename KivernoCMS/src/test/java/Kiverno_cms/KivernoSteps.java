package Kiverno_cms;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class KivernoSteps {
	WebDriver driver;


	@Before
	public void Browser_setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakhan\\SiA-Digital\\KivernoCMS\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void close() {
		//		driver.close();
	}


	@Given("User launch browser")
	public void user_launch_browser() {
		driver.get("https://pilot.kiverno.com/");
		Assert.assertEquals(driver.getTitle(), "Kiverno");
		System.out.println( driver.getTitle());
	}


	@Then("Enter valid username and password")
	public void enter_valid_username_and_password() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		username.sendKeys("superuser");

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement password = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		password.sendKeys("1234");

	}
	@Then("click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("User add client details")
	public void user_add_client_details() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("Myra pvt ltd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\lakhan\\Downloads\\106616793-1594805802117gettyimages-900809876.jpg");
		Thread.sleep(1000);
		WebElement brand = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']"));
		brand.sendKeys("Testing1");
		brand.sendKeys(Keys.ENTER);


		Thread.sleep(1000);
		WebElement role = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-1']"));
		role.sendKeys("Testing1");
		role.sendKeys(Keys.ENTER);

	}
	@Then("click on SaveClient button")
	public void click_on_save_client_button() throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[contains(text(),'Save Client')]")).click();
	}
	@Then("Add Client country details")
	public void add_client_country_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Add Country')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("countryName")).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\lakhan\\Downloads\\106616793-1594805802117gettyimages-900809876.jpg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
	}

	@Then("click on SaveCountry button")
	public void click_on_save_country_button() throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
	}

	@When("User clicks on User Management tab")
	public void user_clicks_on_user_management_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'User Management')]")).click();
	}
	@Then("User add User full details")
	public void user_add_user_full_details() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("abs");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("ans");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("abs@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("abd");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.className("mat-select-arrow")).click();
		driver.findElement(By.xpath("//span[normalize-space()='1-4 Years']")).click();

	}
	@Then("Maps with Client")
	public void maps_with_client() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Client')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Mudbong pvt ltd']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Role')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='QA Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Reporting Manager')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='abhi']")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Manager/Non-Manager')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Non-Manager']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Brand/Therapy Area')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Samsung']")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//span[contains(text(),'Brand/Therapy Area')]")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Lenovo']")).click();
		//		driver.findElement(By.xpath("//html")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//span[contains(text(),'Country')]")).click();	
		//		driver.findElement(By.xpath("//span[normalize-space()='India']")).click();
		//		Thread.sleep(1000);


	}

	@Then("click on SaveMap button")
	public void click_on_save_map_button() throws InterruptedException {
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//span[contains(text(),'Save User')]")).click();	
	}
	@Then("User click on Export button to get data in excel")
	public void user_click_on_export_button_to_get_data_in_excel() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Export')]")).click();	
	}
	@When("User clicks on competency configuratuon tab")
	public void user_clicks_on_competency_configuratuon_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Competency Configuration']")).click();
	}
	@When("Select client")
	public void select_client() throws InterruptedException {
		//		String clientname  = "Mudbong pvt ltd";
		//		List<WebElement> client =driver.findElements(By.xpath("//ul[@class='assesmentBox assessmentHeight1']"));
		//		for (WebElement get : client) {
		//		if(	get.getText().equalsIgnoreCase(clientname)) {
		//			System.out.println(get);
		//			get.click();
		//			}
		//		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mudbong pvt ltd']")).click();

	}
	@When("Assessments model")
	public void assessments_model() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='active list-group-item ng-star-inserted']")).click();
	}
	@Then("User adds Categories inside models")
	public void user_adds_categories_inside_models() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Brand Strategy']")).click();
	}
	@Then("Add Elements inside categories")
	public void add_elements_inside_categories() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Strategic summary']")).click();
	}
	@Then("user adds Options inside each elements")
	public void user_adds_options_inside_each_elements() {

	}

	@Then("click on SaveOptions button")
	public void click_on_save_options_button() throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='row elementBody p-all-5']//span[@class='mat-button-wrapper'][normalize-space()='Save']")).click();
	}
	@Then("User clicks on Report tabs")
	public void user_clicks_on_report_tabs() {

	}
	@Then("generate report through filter")
	public void generate_report_through_filter()throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Report']")).click();
	}
	@Then("User checks report inside Development opp. charts and change overtime tabs")
	public void user_checks_report_inside_development_opp_charts_and_change_overtime_tabs() {

	}
	@Then("Compare with another clients")
	public void compare_with_another_clients() {

	}
	@Then("check submitted forms by managers and non managers")
	public void check_submitted_forms_by_managers_and_non_managers() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='All Form(s)']")).click();
	}
	@Then("click on home icon")
	public void click_on_home_icon() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='home']")).click();
	}
	@Then("clicks on logout button")
	public void clicks_on_logout_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='power_settings_new']")).click();
	}

}
