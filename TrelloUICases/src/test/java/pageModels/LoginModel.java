package pageModels;

import org.openqa.selenium.By;
import org.junit.Assert;

public class LoginModel extends BaseModel {

    public static By txtEmail = By.xpath("//*/input[@id='user']");
    public static By btnContinue = By.xpath("//input[@id='login']");
    public static By txtPassword = By.id("password");
    public static By btnLogin = By.id("login-submit");
    public static By txtTrello = By.xpath("//span[@data-testid='home-team-tab-name']");
    public static By txtUnsuccessfullLoginMessage = By.id("//span/a[text()]']");

    String unsuccessfulLoginMessage = "Incorrect email address and / or password. If you recently migrated your Trello account to an Atlassian account, you will need to use your Atlassian account password. Alternatively, you can get help ";

    public void setEmail(String email) {
        sendKeys(txtEmail, email);
    }

    public void clickContinue() {
        clickElement(btnContinue);
    }

    public void setPassword(String password) {
        isElementClickable(txtPassword);
        sendKeys(txtPassword, password);
    }

    public void clickLoginButton() {
        clickElement(btnLogin);
    }

    public void checkUnsuccessfullMainPageAfterLogin(){
        isElementVisible(txtUnsuccessfullLoginMessage);
    }

    public void checkSuccessMainPageAfterLogin(){
        isElementVisible(txtTrello);
    }
}
