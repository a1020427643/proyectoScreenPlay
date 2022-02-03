package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;

public class StepsDefinitionsChoucair {

    @Before
    public void SetStage(){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given("that {string} wants to learn automation at the Academy Choucair")
    public void thatWantsToLearnAutomationAtTheAcademyChoucair(String actorName) {
        OnStage.theActorCalled(actorName).wasAbleTo(OpenUp.page());
    }


    @When("she searches for the course {string} on the choucair academy platform")
    public void sheSearchesForTheCourseOnTheChoucairAcademyPlatform(String string) {

    }
    @Then("she finds the course called {string}")
    public void sheFindsTheCourseCalled(String string) {

    }

}
