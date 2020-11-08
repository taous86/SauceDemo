package steps_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.InventoryPage;

public class InventorySteps {

    WebDriver driver = LoginSteps.driver;
    InventoryPage inventoryPage = new InventoryPage(driver);

    @Then("user should land on the Inventory page")
    public void userShouldLandOnThePage() {
        Assert.assertTrue(inventoryPage.CheckElementIsVisible());

    }

    @And("the navigation menu should be visible")
    public void theNavigationMenuShouldBeVisible() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(inventoryPage.checkMenuIsVisible());
    }

    @Then("user opens the menu")
    public void userOpensTheMenu() {
        inventoryPage.openMenu();
        Assert.assertTrue(inventoryPage.menuItems()==4);
    }

    @And("user navigates to {string}")
    public void userNavigatesTo(String link) {
        inventoryPage.navigatetoLink(link);
    }

    @Then("all the products should be available")
    public void allTheProductsShouldBeAvailable() {
        Assert.assertTrue(inventoryPage.checkProducts()==6);
    }

    @And("sort by {string}")
    public void sortBy(String option) {
        inventoryPage.selectOption(option);

    }

    @And("the first listed product should be {string}")
    public void theFirstListedProductShouldBe(String productName) {
        Assert.assertTrue(inventoryPage.checkFirstproduct().equals(productName));
    }
}
