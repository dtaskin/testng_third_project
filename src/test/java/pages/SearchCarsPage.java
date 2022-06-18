package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;
import java.util.List;
import java.util.WeakHashMap;

public class SearchCarsPage {
    public SearchCarsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "div[data-qa='menu-flex']>button>span")
    public List<WebElement> filterOptions;

    @FindBy(css = "div[data-test='KeywordSuggestions'] div>input")
    public WebElement searchInputBox;

    @FindBy(css = "button[data-qa='go-button']")
    public WebElement goButton;

    @FindBy(css = "picture[data-qa='base-vehicle-image']>img")
    public List<WebElement> tileImages;

    @FindBy(css = ".favorite-vehicle>svg")
    public List<WebElement> addToFavorite;

    @FindBy(css = "div[data-qa='base-inventory-type']")
    public List<WebElement> inventoryType;

    @FindBy(css = "div[data-qa='make-model']>div")
    public List<WebElement> yearAndMake; //19

    @FindBy(css = ".trim-mileage")
    public List<WebElement> trimAndMileage; // 38 trim and mileage seperate

    @FindBy(css = ".price")
    public List<WebElement> price;

    @FindBy(css = ".monthly-payment span")
    public List<WebElement> monthlyPayment;

    @FindBy(css = ".down-payment")
    public List<WebElement> downPayment;

    @FindBy(css = "div[data-test='NoShippingCostDeliveryChip']>span>span")
    public List<WebElement> deliveryChip;

}
