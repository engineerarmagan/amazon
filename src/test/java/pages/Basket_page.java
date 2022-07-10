package pages;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Basket_page extends Landing_page {


    @FindBy(xpath = "	(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")
    public WebElement basket_total_price;

    @FindBy(xpath = "//span[@id='sc-subtotal-label-buybox']")
    public WebElement basket_quantity;

    public static double expected_basket_price;
    public static String bp_from_web;

    public Basket_page() {PageFactory.initElements(Driver.get(), this);	}

    public void calculated_basket_price() {
        bp_from_web=basket_total_price.getText().split("£")[1];
        expected_basket_price=expected_basket_price+Double.parseDouble(products_price);
        String Expected_value=String.valueOf(expected_basket_price);
        System.out.println("basket price from page="+bp_from_web);
        System.out.println("Expected basket price="+Expected_value);
        Assert.assertTrue(bp_from_web.contains(Expected_value));
    }

public void check_basket_quantity(){
        String ab=basket_quantity.getText().split("\\(")[1];
        String quantity=ab.split(" ")[0];
         System.out.println("quantity="+quantity);


}}
