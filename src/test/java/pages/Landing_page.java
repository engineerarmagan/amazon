package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.text.DecimalFormat;
import java.util.List;

public class Landing_page {
    @FindBy(xpath = "//input[@name='accept']")
    public WebElement accept_cookies_button;

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement search_dropdown;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement search_box;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement search_submit;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> results;

    @FindBy(xpath = "(//div[@class='a-row a-spacing-mini a-size-base a-color-base'])[1]")
    public WebElement type_of_first_product;

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//span[@class='a-badge-label']")
    public List<WebElement> badge_labels;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement whole_price;

    @FindBy(xpath = "(//span[@class='a-price-fraction'])[1]")
    public WebElement fraction_price;

    public static String search_ite;

    public static String products_price;
    public static int number;

    public Landing_page() {PageFactory.initElements(Driver.get(), this);}

    public void accept_cookies() {
        try {
            BrowserUtils.waitForClickablility(accept_cookies_button, 5).click();
        } catch (WebDriverException e) {
            System.out.println();
        }
    }

    public void search_dropdown() {
        search_dropdown.click();
    }

    public void navigate_to_categories(String tab) {
        String tab_locator = "//select[@id='searchDropdownBox']//option[contains(text(),'" + tab + "')]";
        WebElement tab1 = Driver.get().findElement(By.xpath(tab_locator));
        BrowserUtils.waitFor(2);
        tab1.click();

    }

    public void search_an_item(String search_item) {
        search_ite=search_item;
        search_box.sendKeys(search_item);
        search_submit.click();
    }

    public void get_first_from_result(String expected) {
        WebElement first_result = results.get(0);
        String first_result_text = first_result.getText();
        System.out.println("first products name=" + first_result_text);
        Assert.assertTrue(first_result_text.contains(expected));
        System.out.println("First result contains searched product name");

    }

    public void book_type_check(String expected_type) {
        String actual_type = type_of_first_product.getText();
        System.out.println("products actual type=" + actual_type);
        Assert.assertTrue(actual_type.equals(expected_type));
    }

    public void single_price_check(String expected_price) {
        String actual_whole_price = whole_price.getText();
        String actual_fraction_price = fraction_price.getText();
        products_price = actual_whole_price + "." + actual_fraction_price;
        System.out.println("actual price=" + products_price);
        System.out.println("expected price=" + expected_price);
        Assert.assertTrue(products_price.equals(expected_price));
        System.out.println("Actual and expected price are same");

    }


    public void navigate_to_first_item() {
        WebElement first_result = results.get(0);
        first_result.click();
        BrowserUtils.waitFor(2);
    }


    public void navigate_url() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String title=Driver.get().getTitle();
        Assert.assertTrue(title.equals("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more"));
        System.out.println("You are on correct page");
        Driver.get().manage().window().maximize();
    }
}
