package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import io.restassured.response.Response;

import org.junit.Ignore;
import org.junit.Test;
import org.hamcrest.Matchers;
import static  io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.*;

public class ReqresTesting {

    @Given("^I am on Reqres Website$")
public void i_am_on_Reqres_Website()  {

   Response res = given()
           .when().get("https://reqres.in/");


}

    @When("^I click on Get method$")
    public void i_click_on_Get_method()  {
        Response res = given()
                .when().get("https://reqres.in/api/users?page=2");


    }

    @Then("^I should be able to see response$")
    public void i_should_be_able_to_see_response()  {
        Response res = given()
                .when().get("https://reqres.in/api/users?page=2");
        res.then().statusCode(200);
        res.prettyPrint();


    }


}
