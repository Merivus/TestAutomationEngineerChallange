package pageModels;

import org.openqa.selenium.By;

public class ListModel extends BaseModel{

    public static By btnList = By.xpath("//div/form/a[contains(@class, 'open-add-list')]/span/span");

    public static By txtListName = By.xpath("//div/form/input[@class='list-name-input'][@placeholder='Enter list title…']");

    public static By btnAddList = By.xpath("//div/input[@value='Add list']");

    public void clickList() {
        clickElement(btnList);
    }

    public void setList(String listName) throws InterruptedException {
        clickElement(btnList);
        webDriver.wait(15);
        sendKeys(txtListName, listName);
    }

    public void clickAddListButton() {
        clickElement(btnAddList);
    }
}
