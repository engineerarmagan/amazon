package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Landing_page;

import utilities.ConfigurationReader;
import utilities.Driver;

public class Landing_page_stepdefs {


    @Given("the user is on the url")
    public void the_user_is_on_the_url() {
        new Landing_page().navigate_url();
        new Landing_page().accept_cookies();
    }

    @When("the user selects section {string}")
    public void the_user_selects_section(String category) {
        new Landing_page().search_dropdown();
        new Landing_page().navigate_to_categories(category);


    }

    @When("searchs {string}")
    public void searchs(String product) {
        new Landing_page().search_an_item(product);

    }

    @Then("the user should see the result {string}")
    public void the_user_should_see_the_result(String expected) {
        System.out.println("expected product name="+expected);
        new Landing_page().get_first_from_result(expected);

    }

    @Then("has a badge {string}")
    public void has_a_badge(String badge) {
        System.out.println("badge check");
    }

    @Given("selected type is {string}")
    public void selected_type_is(String expected_product_type) {
        new Landing_page().book_type_check(expected_product_type);
        System.out.println("expected product type="+expected_product_type);
    }

    @Given("the price is {string}")
    public void the_price_is(String expected_price) {
        new Landing_page().single_price_check(expected_price);

    }

    @When("the user navigates to book details")
    public void the_user_navigates_to_book_details() {
        new Landing_page().navigate_to_first_item();

    }




}
