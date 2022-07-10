package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class First_item_page extends Landing_page {


    @FindBy(xpath = "(//span[@data-a-class='quantity']//span)[5]")
    public WebElement quantity;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement product_title;

    @FindBy(xpath = "//span[@class='a-size-base a-color-price a-color-price']")
    public WebElement product_price;
    public static String title;
    public static String price;


    public First_item_page() { PageFactory.initElements(Driver.get(), this);}



    public void get_quantity() {
        number++;
        String basket_quantity=quantity.getText();
        Assert.assertTrue(String.valueOf(number).equals(basket_quantity));
    }


    public void check_details() {
        title=product_title.getText();
        Assert.assertTrue(title.contains(Landing_page.search_ite));
        price=product_price.getText().split("£")[1];

    }

}
