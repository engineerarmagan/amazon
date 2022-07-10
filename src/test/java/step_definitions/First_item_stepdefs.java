package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Added_to_basket_page;
import pages.First_item_page;
import pages.Landing_page;
import pages.Search_result_page;

public class First_item_stepdefs {

    @Given("item is added to the basket")
    public void item_is_added_to_the_basket() {
        new Search_result_page().add_to_the_basket();

    }


    @Then("item title,badge,price and type should be the same")
    public void title_badge_price_and_type_should_be_the_same() {
        new First_item_page().check_details();


    }

    @When("the user edit the basket")
    public void the_user_edit_the_basket() {
        new Added_to_basket_page().go_to_basket();


    }
    @Then("title should contain {string}")
    public void title_should_contain(String string) {
        System.out.println("title should contain {string}");
    }

    @Then("badge, price and type should be the same")
    public void badge_price_and_type_should_be_the_same() {
        System.out.println("badge, price and type should be the same");
    }

    @Given("the user add the book to the basket")
    public void the_user_add_the_book_to_the_basket() {
        System.out.println("the user add the book to the basket");
    }
}
