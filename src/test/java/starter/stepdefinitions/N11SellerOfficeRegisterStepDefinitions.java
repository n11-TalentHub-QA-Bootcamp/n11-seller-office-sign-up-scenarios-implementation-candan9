package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.user_interface.n11UserHomePageElements;
import starter.n11_seller_office.sign_up.SignUpAsSellerOffice;
import starter.n11_seller_office.tasks.NavigateTo;
import starter.n11_seller_office.user_interface.n11SellerOfficeHomePageElements;

public class N11SellerOfficeRegisterStepDefinitions {
    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the login page")
    public void userLaunchBrowserAndOpenTheLoginPage() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11SellerOfficeHomePage());
    }

    @When("user signed in selleroffice with valid credentials")
    public void userSignedInSellerofficeWithValidCredentials() {
        actor.attemptsTo(SignUpAsSellerOffice.signUpAsSellerOffice(
                "candanemre9","1234012400","1234012400",
                "emrecndn9@gmail.com","emrecndn9@gmail.com","candankuruyemis"));
    }

    @Then("user signed in selleroffice successfully")
    public void userSignedInSellerofficeSuccessfully() {
        actor.attemptsTo(
                Ensure.that(n11SellerOfficeHomePageElements.ERROR_MESSAGE).isDisplayed()
        );
    }
}
