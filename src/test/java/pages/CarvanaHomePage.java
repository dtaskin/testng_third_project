package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CarvanaHomePage {
    public CarvanaHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "div[class='Logo__LogoWrapper-sc-14r2405-0 fSZhVx']")
    public WebElement logo;

    @FindBy(css = "[class^='Navigationstyles__NavigationWrapper']>div>a")
    public List<WebElement> mainMenuItems;

    @FindBy(css = "div[data-qa='desktop-wrapper']>a")
    public WebElement signInLink;

    @FindBy(css = "[class^='HeaderContainer']")
    public WebElement signInModalHeader;

    @FindBy(css = "#usernameField")
    public WebElement email;

    @FindBy(css = "#passwordField")
    public WebElement password;

    @FindBy(css = "button[data-cv='sign-in-submit']")
    public WebElement signInButton;

    @FindBy(css = "div[data-qa='error-message-container']")
    public WebElement errorMessage;

    @FindBy(css = "a[data-cv-test='headerSearchLink']")
    public WebElement searchCarsLink;



}
