package tests;

import com.thoughtworks.gauge.Step;
import pageModels.BoardModel;

public class BoardTest extends BaseTest {

    BoardModel boardModel;

    public BoardTest() {
        this.boardModel = new BoardModel();
    }

    @Step("Click to Create new board button")
    public void clickCreateTheBoardButton(){
        boardModel.clickCreateTheBoardButton();
    }

    @Step("Select the Board background")
    public void selectBoardBackground(){
        boardModel.selectBoardBackground();
    }

    @Step("Select the Board visibility")
    public void selectBoardVisibility(){
        boardModel.selectBoardVisibility();
    }

    @Step("Set board title <key>")
    public void setPassword(String boardTitle){
        boardModel.setBoardTitle(boardTitle);
    }

    @Step("Click create a board button")
    public void clickBoardCreate(){
        boardModel.clickBoardCreate();
    }

    @Step("Add board to favorite list")
    public void clickFavoritesButton(){
        boardModel.clickFavoritesButton();
    }

    @Step("Click details button")
    public void clickDetailsButton() {
        boardModel.clickDetailsButton();
    }

    @Step("Click more button")
    public void clickMoreButton() {
        boardModel.clickMoreButton();
    }

    @Step("Close the board")
    public void clickCloseBoardButton() {
        boardModel.clickCloseBoardButton();
    }

    @Step("View all of the closed boards")
    public void clickAllClosedBoardsButton() {
        boardModel.clickAllClosedBoardsButton();
    }

    @Step("Click to Delete board")
    public void clickDeleteBoardButton() {
        boardModel.clickDeleteBoardButton();
    }

    @Step("Delete the board completely")
    public void clickDeleteButton() {
        boardModel.clickDeleteButton();
    }
}
