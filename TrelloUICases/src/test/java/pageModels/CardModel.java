package pageModels;

import org.openqa.selenium.By;

public class CardModel extends BaseModel {

    public static By btnAddCard = By.xpath("//div/a/span[@class='js-add-a-card'][1]");
    public static By txtCardTitle = By.xpath("//div/div/div[contains(@class, 'list-card-details')]");

    // Add cart button
    public static By btnAdd = By.xpath("//div/div/input[contains(@class, 'add-card')]");

    // Edit Card button
    public static By btnEditCard = By.xpath("//div/div[contains(@class, 'card-quick-edit')]");
    public static By btnMove = By.xpath("//div/a[contains(@class, 'move-card')]");
    public static By chkList = By.xpath("//select[contains(@class, 'select-list')]");
    public static By btnListPosition = By.xpath("//select[contains(@class, 'select-list') and position()=3]");
    public static By btnMoveCard = By.xpath("//div/div/input[@type='submit' and @value='Move']");

    public void clickAddACardButton() {
        clickElement(btnAddCard);
    }

    public void setCardTitle(String cardTitle) {
        sendKeys(txtCardTitle, cardTitle);
    }

    public void clickAddCard() {
        clickElement(btnAdd);
    }

    public void clickEditCard () {
        clickElement(btnEditCard);
    }

    public void clickButtonMove() {
        clickElement(btnMove);
    }

    public void selectListPosition() {
        clickElement(chkList);
        clickElement(btnListPosition);
    }

    public void clickMoveCardButton() {
        clickElement(btnMoveCard);
    }

}
