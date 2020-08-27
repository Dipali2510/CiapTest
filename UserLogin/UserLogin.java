import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.lang.String;

public Class UserLogin {
  
  @Given("^User is on the Login Page$")
  public void UserIsOnTheLoginPage() {
    org.junit.Assert.fail();
  }
  
  @When("^he enters his username as <username>$")
  public void heEntersHisUsernameAsUsername() {
    org.junit.Assert.fail();
  }
  
  @When("^he enters his password$")
  public void heEntersHisPassword() {
    org.junit.Assert.fail();
  }
  
  @When("^he is successfully authenticated through ldap$")
  public void heIsSuccessfullyAuthenticatedThroughLdap() {
    org.junit.Assert.fail();
  }
  
  @Then("^he must be logged in and taken to the homepage$")
  public void heMustBeLoggedInAndTakenToTheHomepage() {
    org.junit.Assert.fail();
  }
  
}
