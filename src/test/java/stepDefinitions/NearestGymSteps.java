package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.NearestGymPage;

import static Hooks.HookTest.driver;

public class NearestGymSteps {


    public NearestGymPage nearestGymPage;

    public NearestGymSteps()
    {
        nearestGymPage = new NearestGymPage(driver);
    }



    @Given("I navigate to the website")
    public void iNavigateToTheWebsite() {
        driver.get(" https://www.nuffieldhealth.com/gyms");
        nearestGymPage.clickAcceptCookies();
    }

//    @When("I enter postcode {string}")
//    public void iEnterPostcode(String code) {
//        try {
//            nearestGymPage.enterPostcode(code);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

//    @Then("list view displayed successfully")
//    public void listViewDisplayedSuccessfully() throws InterruptedException {
//        Assert.assertTrue(nearestGymPage.ListViewMapViewDisplayed());
//
//    }


}
