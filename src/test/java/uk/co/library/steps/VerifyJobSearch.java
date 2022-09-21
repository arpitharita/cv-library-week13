package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class VerifyJobSearch {
    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String JobTitle)
    {
        new HomePage().enterjobTitle(JobTitle);

    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)
    {
        new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance)
    {
        new HomePage().selectDistance(distance);
    }

    @And("^I click on more Search Options Link$")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickLink();
    }

    @And("^I enter SalaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String min)
    {
        new HomePage().salaryMin(min);

    }

    @And("^I enter SalaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String max)
    {
        new HomePage().salaryMax(max);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String sal)
    {
        new HomePage().selectSalaType(sal);
    }

    @And("^I select Job Type \"([^\"]*)\"$")
    public void iSelectJobType(String job)
    {
        new HomePage().selectJobType(job);
    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickJobButton();

    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result)
    {
        Assert.assertEquals(result, new ResultPage().verifyTextSuccessfully(result));

    }

    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {


    }
}
