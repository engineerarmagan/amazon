package step_definitions;


import io.cucumber.java.en.When;
import pages.Added_to_basket_page;
import pages.Landing_page;

public class Added_to_basket_stepdefs{




    @When("item number in the basket is correct")
    public void its_only_one_item_in_basket() {
        new Added_to_basket_page().get_checkout_item_number();

    }
}