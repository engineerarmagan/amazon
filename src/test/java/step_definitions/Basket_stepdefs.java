package step_definitions;

import io.cucumber.java.en.Then;
import pages.Added_to_basket_page;
import pages.Basket_page;
import utilities.Driver;

public class Basket_stepdefs {


    @Then("title,badge,price and type should be the same")
    public void title_badge_price_and_type_should_be_the_same() {
        new Basket_page().calculated_basket_price();
    }

    @Then("get the quantity on the page")
    public void quantity_is_correct() {
        new Basket_page().check_basket_quantity();

    }
}
