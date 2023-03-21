package tests;

import com.thoughtworks.gauge.Step;
import pageModels.HomeModel;

public class HomeTest extends BaseTest {

    HomeModel homeModel;

    public HomeTest(){
        this.homeModel= new HomeModel();
    }

    @Step("Enter <key> Trello Home Page")
    public void goToUrl(String url) throws Exception {
        homeModel.goToUrl(url);
        log.info(url+ "Browser is opening.");
    }

    @Step("Click to Login Button")
    public void clickToLoginButton(){
        homeModel.clickToLoginButton();
        log.info("click to login button!");
    }

}