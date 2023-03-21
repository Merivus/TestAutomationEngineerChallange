package pageModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeModel extends BaseModel{
    public static By btnLogin = By.xpath("//*/a[contains(@class, 'Buttonsstyles')][1]");

    public void goToUrl(String url) {
        webDriver.get(url);
    }

    public void clickToLoginButton(){
        clickElement(btnLogin);
    }
}
