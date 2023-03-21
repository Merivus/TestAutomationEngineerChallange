package pageModels;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.openqa.selenium.By;

public class BoardModel extends BaseModel{

    public static By btnCreateBoard = By.xpath("//div[@class='board-tile mod-add']");

    public static By btnBoardBackground = By.xpath("//div[@id='background-picker']/ul/li[5]");
    public static By chkVisibility = By.xpath("//div/div[contains(@id,'visibility')]");

    public static By txtBoardTitle = By.xpath("//div//input[contains(@class, 'textfield')]");

    public static By btnCreate = By.xpath("//div//button[@data-testid='create-board-submit-button']");

    // Add Board Favorite List
    public static By btnFavorites = By.xpath("//div/a[contains(@class, 'board-header-star')]");

    // For Click ... button
    public static By btnDetails = By.xpath("//div/button[@aria-label='Show menu']");

    // For Click ... More button
    public static By btnMore = By.xpath("//li[@class='board-menu-navigation-item'][4]");

    // For Click Close Board button
    public static By btnCloseBoard = By.xpath("//li/a[contains(@class, 'close-board')]");
    public static By btnClose = By.xpath("//input[@value='Close']");

    // For View all Close Boards
    public static By btnCloseAllBoards = By.xpath("//div/button[contains(@class, 'view-all-closed-boards-button')]");
    public static By btnDeleteBoard = By.xpath("//div/button[@data-testid='close-board-delete-board-button'][1]");
    public static By btnDelete = By.xpath("//div/button[@data-testid='close-board-delete-board-confirm-button']");

    public void clickCreateTheBoardButton() {
        clickElement(btnCreateBoard);
    }

    public void selectBoardBackground() {
        clickElement(btnBoardBackground);
    }

    public void selectBoardVisibility() {
        clickElement(chkVisibility);
        clickElement(chkVisibility);
    }

    public void setBoardTitle(String boardTitle) {
        sendKeys(txtBoardTitle, boardTitle);
    }

    public void clickBoardCreate() {
        clickElement(btnCreate);
    }

    public void clickFavoritesButton() {
        clickElement(btnFavorites);
    }

    public void clickDetailsButton() {
        clickElement(btnDetails);
    }

    public void clickMoreButton() {
        clickElement(btnMore);
    }

    public void clickCloseBoardButton() {
        clickElement(btnCloseBoard);
        clickElement(btnClose);
    }

    public void clickAllClosedBoardsButton() {
        clickElement(btnCloseAllBoards);
    }

    public void clickDeleteBoardButton() {
        clickElement(btnDeleteBoard);
    }

    public void clickDeleteButton() {
        clickElement(btnDelete);
    }
}
