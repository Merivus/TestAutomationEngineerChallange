package tests;

import com.thoughtworks.gauge.Step;
import pageModels.CardModel;

public class CardTest extends BaseTest{

    CardModel cardModel;

    public CardTest() {
        this.cardModel = new CardModel();
    }

    @Step("Click on the Add a card button")
    public void clickAddACardButton(){
        cardModel.clickAddACardButton();
    }

    @Step("Enter a title <key> for this card")
    public void setCardTitle(String cardTitle){
        cardModel.setCardTitle(cardTitle);
    }

    @Step("Add your card title with click Add card button")
    public void clickAddCard(){
        cardModel.clickAddCard();
    }

    @Step("Click on the Edit card button")
    public void clickEditCard(){
        cardModel.clickEditCard();
    }

    @Step("Select Move button")
    public void clickButtonMove(){
        cardModel.clickButtonMove();
    }

    @Step("Select List Position on the checkbox")
    public void selectListPosition(){
        cardModel.selectListPosition();
    }

    @Step("Move the card on the DONE List status")
    public void clickMoveCardButton(){
        cardModel.clickMoveCardButton();
    }

}
