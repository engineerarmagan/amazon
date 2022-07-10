package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Search_result_page extends Landing_page {

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement product_title;

    @FindBy(xpath = "(//span[@class='a-button a-button-selected a-spacing-mini a-button-toggle format']//a//span)[1]")
    public WebElement product_type;

    @FindBy(xpath = "(//span[@class='a-button a-button-selected a-spacing-mini a-button-toggle format']//a//span)[2]")
    public WebElement product_price;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement add_to_cart_button;



    public Search_result_page() {PageFactory.initElements(Driver.get(), this); }

    public void add_to_the_basket() {
        add_to_cart_button.click();
    }
    public void product_details_check(String title,String type, String price) {
        String actual_title=product_title.getText();
        String actual_type=product_type.getText();
        String actual_price=product_price.getText();
        Assert.assertTrue(actual_title.equals(title));
        Assert.assertTrue(actual_type.equals(type));
        Assert.assertTrue(actual_price.equals(price));
    }




}
