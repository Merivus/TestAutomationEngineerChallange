package steps;

import com.mashape.unirest.http.exceptions.UnirestException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.TrelloHelpers;

import org.junit.Assert;
import request.CreateNewOrganizationRequest;
import request.GetOrganizationRequest;
import request.UpdateOrganizationRequest;
import response.CreateNewOrganizationResponse;
import response.GetOrganizationResponse;
import response.UpdateResponse;

public class Steps {
    private TrelloHelpers trelloHelpers;
    public CreateNewOrganizationResponse createNewOrganizationResponse = new CreateNewOrganizationResponse();
    public GetOrganizationResponse getOrganizationResponse = new GetOrganizationResponse();
    public UpdateResponse updateResponse = new UpdateResponse();
    public Steps(TrelloHelpers trelloHelpers){
        this.trelloHelpers = trelloHelpers;
    }



    @Given("^I create a new organization$")
    public void createNewOrganization()throws UnirestException {

        CreateNewOrganizationRequest request = new CreateNewOrganizationRequest();
        createNewOrganizationResponse= trelloHelpers.postCreateNewOrganization(request);
    }

    @Then("^I should see new organization is created$")
    public void seeNewOrganization()throws UnirestException, Throwable, InterruptedException{

        GetOrganizationRequest request = new GetOrganizationRequest();
        request.id = createNewOrganizationResponse.id;
        getOrganizationResponse = trelloHelpers.getOrganization(request);

        checkCreatedNewOrganization();
    }

    @Then("^I update an organization$")
    public void updateOrganization()throws UnirestException, Throwable, InterruptedException{

        UpdateOrganizationRequest request = new UpdateOrganizationRequest();
        request.id = createNewOrganizationResponse.id;
        updateResponse = trelloHelpers.updateOrganization(request);

        checkUpdateNewOrganization();
    }

    public void checkCreatedNewOrganization(){
        Assert.assertTrue( createNewOrganizationResponse.id.equalsIgnoreCase(getOrganizationResponse.id));
        Assert.assertTrue( createNewOrganizationResponse.name.equalsIgnoreCase(getOrganizationResponse.name));
        Assert.assertTrue( createNewOrganizationResponse.url.equalsIgnoreCase(getOrganizationResponse.url));
        Assert.assertTrue( createNewOrganizationResponse.displayName.equalsIgnoreCase(getOrganizationResponse.displayName));
    }

    public void checkUpdateNewOrganization(){
        Assert.assertTrue( updateResponse.id.equalsIgnoreCase(updateResponse.id));
        Assert.assertTrue( updateResponse.name.equalsIgnoreCase(updateResponse.name));
        Assert.assertTrue( updateResponse.url.equalsIgnoreCase(updateResponse.url));
        Assert.assertTrue( updateResponse.displayName.equalsIgnoreCase(updateResponse.displayName));
    }


}
