package pages;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Added_to_basket_page extends Landing_page {


    @FindBy(xpath = "(//div[@id='add-to-cart-confirmation-image']//following-sibling::div)[2]//span")
    public WebElement added_to_basket_note;

    @FindBy(xpath = "//div[@data-feature-id='proceed-to-checkout-label']")
    public WebElement proceed_to_checkout_button;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement whole_price;

    @FindBy(xpath = "(//span[@class='a-price-fraction'])[1]")
    public WebElement fraction_price;



    @FindBy(xpath = "//span[@id='sw-gtc']")
    public WebElement go_to_basket_button;

    public static int item_number=0;
    public static String number;
    public static int basket_price_total=0;



    public Added_to_basket_page() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void go_to_basket() {
        go_to_basket_button.click();
    }


    public void get_checkout_item_number() {
        Assert.assertTrue(added_to_basket_note.isDisplayed());
        String proceed=proceed_to_checkout_button.getText();
        String number=proceed.split("[(]")[1];
        number=number.split(" ")[0];
        System.out.println("item number="+number);

    }
    public void check_item_number_correct() {

        item_number=item_number + Integer.valueOf(number);
        System.out.println("item_number="+item_number);
    }







}

