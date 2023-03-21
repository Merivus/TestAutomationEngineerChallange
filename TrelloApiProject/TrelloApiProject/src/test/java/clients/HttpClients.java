package clients;


import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.body.RequestBodyEntity;

public class HttpClients {

    protected RequestBodyEntity post(String path, String body)  {

        return Unirest
                //.post(String.join("/",path))
                .post(path)
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .header("Connection","keep-alive")
                .body(body);
    }

    protected GetRequest get(String path){
        return Unirest
                .get(path)
                .header("Content-Type","application/json")
                .header("Connection","keep-alive");
    }

    public RequestBodyEntity put(String path, String body){
        return Unirest
                .put(path)
                .header("Content-Type","application/json")
                .header("Connection","keep-alive")
                .body(body);
    }
}
