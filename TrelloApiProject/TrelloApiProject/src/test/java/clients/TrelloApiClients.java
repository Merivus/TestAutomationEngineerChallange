package clients;

import com.mashape.unirest.http.exceptions.UnirestException;
import request.UpdateOrganizationRequest;
import response.UpdateResponse;
import utils.UnirestObjectMapper;
import request.CreateNewOrganizationRequest;
import request.GetOrganizationRequest;
import response.CreateNewOrganizationResponse;
import response.GetOrganizationResponse;


import org.apache.http.HttpStatus;

public class TrelloApiClients extends HttpClients {

    public CreateNewOrganizationResponse postDeneme(CreateNewOrganizationRequest request) throws UnirestException{
        var resp = post("https://api.trello.com/1/organizations?displayName=TrelloApiRequests&key=1815ebcaa2d429f6d2ab6daab12b63aa&token=fe33e87b305a8801472833f6ebd2266eb3a821e173162b208e57a290b204c03c","").asJson();
        if(resp.getStatus() ==HttpStatus.SC_OK){
            UnirestObjectMapper mapper = new UnirestObjectMapper();
            return mapper.readValue(resp.getBody().getObject().toString(),CreateNewOrganizationResponse.class);
        } else {
            var res = new CreateNewOrganizationResponse();

            return res;
        }
    }

    public GetOrganizationResponse getGetOrganizationResponse(GetOrganizationRequest request)throws UnirestException {
        var resp = get("https://api.trello.com/1/organizations/"+request.id+"?key=1815ebcaa2d429f6d2ab6daab12b63aa&token=fe33e87b305a8801472833f6ebd2266eb3a821e173162b208e57a290b204c03c").asJson();
        if(resp.getStatus() ==HttpStatus.SC_OK){
            UnirestObjectMapper mapper = new UnirestObjectMapper();
            return mapper.readValue(resp.getBody().getObject().toString(),GetOrganizationResponse.class);
        } else {
            var res = new GetOrganizationResponse();

            return res;
        }
    }

    public UpdateResponse putUpdateOrganizationResponse(UpdateOrganizationRequest request)throws UnirestException {

        var resp = put("https://api.trello.com/1/organizations/"+request.id+"?key=1815ebcaa2d429f6d2ab6daab12b63aa&token=fe33e87b305a8801472833f6ebd2266eb3a821e173162b208e57a290b204c03c","").asJson();
        UnirestObjectMapper mapper = new UnirestObjectMapper();
        return mapper.readValue(resp.getBody().getObject().toString(),UpdateResponse.class);
    }

}
