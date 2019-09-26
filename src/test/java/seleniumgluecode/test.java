package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class test {
    public static WebDriver driver;
    @Given("^that i am on the shopping website$")
    public void that_i_am_on_the_shopping_website() throws Throwable {
        System.setProperty("webdriver.gecko.driver","D:/Softwares/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.quit();
    }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
        String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
        String actual = driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.quit();
    }

    @Given("^that i am on the EdgeOps Application$")
    public void thatIAmOnTheEdgeOpsApplication() {
        //System.setProperty("webdriver.gecko.driver","D:/Softwares/geckodriver/geckodriver.exe");
        //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.google.com/");
        //driver.quit();
        Assert.assertEquals("True", "True");
    }
    @Given("^open Admin_deatils Page$")
    public void open_Admin_deatils_Page() throws Throwable {
       Assert.assertTrue(false);
    }

    @When("^click on Admin_Info button$")
    public void click_on_Admin_Info_button() throws Throwable {
    	Assert.assertTrue(true);
        
    }

    @Then("^should redirect to Admin Info page$")
    public void should_redirect_to_Admin_Info_page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Given("^open Finance_deatils Page$")
    public void open_Finance_deatils_Page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @When("^click on Finance_Info button$")
    public void click_on_Finance_Info_button() throws Throwable {
    	Assert.assertTrue(true);
     
    }

    @Then("^should redirect to Finance Info page$")
    public void should_redirect_to_Finance_Info_page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Given("^Open login Page$")
    public void open_login_Page() throws Throwable {
    	Assert.assertTrue(true);
    }

    @Given("^Enter valid username and password$")
    public void enter_valid_username_and_password() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @When("^clicked on login button$")
    public void clicked_on_login_button() throws Throwable {
    	Assert.assertTrue(true);
      
    }

    @Then("^should open Homepage$")
    public void should_open_Homepage() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Given("^Set API endpoint$")
    public void set_API_endpoint() throws Throwable {
    	Assert.assertTrue(true);
      
    }

    @When("^run GET request$")
    public void run_GET_request() throws Throwable {
    	Assert.assertTrue(true);
   
    }

    @Then("^should get valid HTTP respone$")
    public void should_get_valid_HTTP_respone() throws Throwable {
    	Assert.assertTrue(true);
      
    }

    @Given("^open Client_deatils Page$")
    public void open_Client_deatils_Page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @When("^click on client_Info button$")
    public void click_on_client_Info_button() throws Throwable {
    	Assert.assertTrue(true);
      
    }

    @Then("^should redirect to client Info page$")
    public void should_redirect_to_client_Info_page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Given("^open company_deatils Page$")
    public void open_company_deatils_Page() throws Throwable {
    	Assert.assertTrue(true);
     
    }

    @When("^click on company_Info button$")
    public void click_on_company_Info_button() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Then("^should redirect to company Info page$")
    public void should_redirect_to_company_Info_page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Given("^open customer_deatils Page$")
    public void open_customer_deatils_Page() throws Throwable {
    	Assert.assertTrue(true);
        
    }

    @When("^click on customer_Info button$")
    public void click_on_customer_Info_button() throws Throwable {
    	Assert.assertTrue(true);
    }

    @Then("^should redirect to customer Info page$")
    public void should_redirect_to_customer_Info_page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Given("^open emp_deatils Page$")
    public void open_emp_deatils_Page() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @When("^click on emp_Info button$")
    public void click_on_emp_Info_button() throws Throwable {
    	Assert.assertTrue(true);
     
    }

    @Then("^should redirect to emp Info page$")
    public void should_redirect_to_emp_Info_page() throws Throwable {
    	Assert.assertTrue(true);
        
    }

    @Given("^open login page$")
    public void open_login_page()  {
  
    }

    @Given("^enter username and password$")
    public void enter_username_and_password() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @When("^click on login$")
    public void click_on_login() throws Throwable {
    	Assert.assertTrue(false);
       
    }

    @Then("^should open HomePage$")
    public void should_open_HomePage() throws Throwable {
    	Assert.assertTrue(false);
       
    }

    @Then("^should open HomePage of UST$")
    public void should_open_HomePage_of_UST() throws Throwable {
    	Assert.assertTrue(false);
    
    }

}