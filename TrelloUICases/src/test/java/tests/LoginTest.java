package tests;

import pageModels.LoginModel;
import com.thoughtworks.gauge.Step;

public class LoginTest extends BaseTest {

    LoginModel loginModel;

    public LoginTest() {
        this.loginModel = new LoginModel();
    }

    @Step("Set email <key> in login page")
    public void setEmail(String email){
        loginModel.setEmail(email);
    }

    @Step("Click to Continue button")
    public void clickContinue(){
        loginModel.clickContinue();
    }

    @Step("Set password <key> in login page")
    public void setPassword(String password){
        loginModel.setPassword(password);
    }

    @Step("Click to Log In button")
    public void clickLoginButton(){
        loginModel.clickLoginButton();
    }

    @Step("It shows failed login")
    public void checkUnsuccessfullyMainPageAfterLogin(){
        loginModel.checkUnsuccessfullMainPageAfterLogin();
    }

    @Step("It shows success login")
    public void checkSuccessMainPageAfterLogin(){
        loginModel.checkSuccessMainPageAfterLogin();
    }
}
