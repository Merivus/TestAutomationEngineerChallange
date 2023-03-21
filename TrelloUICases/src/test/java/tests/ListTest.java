package tests;

import com.thoughtworks.gauge.Step;
import pageModels.BoardModel;
import pageModels.ListModel;

public class ListTest extends BaseTest {

    ListModel listModel;

    public ListTest() {
        this.listModel = new ListModel();
    }

    @Step("Click to Add a list button")
    public void clickList(){
        listModel.clickList();
    }

    @Step("Add a list name <key>")
    public void setListName(String listName) throws InterruptedException {
        listModel.setList(listName);
    }

    @Step("Add your list")
    public void clickAddList(){
        listModel.clickAddListButton();
    }
}
