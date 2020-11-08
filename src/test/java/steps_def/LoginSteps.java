package steps_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;

public class LoginSteps {

    public static WebDriver driver;
    String url= "https://www.saucedemo.com/";
    LoginPage loginPage;

    @Given("user is on the sauceDemo LoginPage")
    public void user_is_on_the_sauce_demo_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Given("user logs in with {string},{string}")
    public void user_logs_in_with(String user, String pass) {
        // Write code here that turns the phrase above into concrete actions
        loginPage = new LoginPage(driver);
        loginPage.InsertUserName(user);
        loginPage.InsertPassword(pass);
        loginPage.login();
    }


    @Then("user should see the error button")
    public void userShouldSeeTheErrorButton() {
        Assert.assertTrue(loginPage.errorButton());
    }
}
