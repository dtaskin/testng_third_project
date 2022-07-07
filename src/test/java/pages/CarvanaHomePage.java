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
    @FindBy(css = "div[data-qa='logo-wrapper']")
    public WebElement logo;

    @FindBy(css = "[class^='Navigationstyles__NavigationWrapper']>div>a")
    public List<WebElement> mainMenuItems;

    @FindBy(css = "div[data-qa='desktop-wrapper']>a")
    public WebElement signInLink;

    @FindBy(css = "[class^='HeaderContainer']")
    public WebElement signInModal;

    @FindBy(css = "#usernameField")
    public WebElement emailInputBox;

    @FindBy(css = "#passwordField")
    public WebElement passwordInputBox;

    @FindBy(css = "button[data-cv='sign-in-submit']")
    public WebElement modalSignInButton;

    @FindBy(css = "div[data-qa='error-message-container']")
    public WebElement errorMessage;

    @FindBy(css = "a[data-cv-test='headerSearchLink']")
    public WebElement searchCarsLink;



}
