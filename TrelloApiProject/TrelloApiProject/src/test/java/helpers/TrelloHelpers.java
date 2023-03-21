package helpers;

import clients.TrelloApiClients;
import com.mashape.unirest.http.exceptions.UnirestException;

import request.CreateNewOrganizationRequest;
import request.GetOrganizationRequest;
import request.UpdateOrganizationRequest;
import response.CreateNewOrganizationResponse;
import response.GetOrganizationResponse;
import response.UpdateResponse;

public class TrelloHelpers {
    private TrelloApiClients trelloApiClients;


    public TrelloHelpers(TrelloApiClients clients){
        super();
        this.trelloApiClients = clients;
    }

    public CreateNewOrganizationResponse postCreateNewOrganization(CreateNewOrganizationRequest request)throws UnirestException{

        return trelloApiClients.postDeneme(request);
    }

    public GetOrganizationResponse getOrganization(GetOrganizationRequest request)throws UnirestException{

        return trelloApiClients.getGetOrganizationResponse(request);
    }

    public UpdateResponse updateOrganization(UpdateOrganizationRequest request)throws UnirestException{

        return trelloApiClients.putUpdateOrganizationResponse(request);
    }
}
