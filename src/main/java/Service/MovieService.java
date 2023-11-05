package Service;

import bean.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
public class MovieService {
public Root getmoviebyname(String name) throws IOException {
    OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder()
            .url("https://www.omdbapi.com/?apikey=9945c163&t="+name)
            .build();
    ResponseBody response = client.newCall(request).execute().body();
    ObjectMapper objectMapper = new ObjectMapper();
    Root root = objectMapper.readValue(response.string(), Root.class);
    System.out.println(root);
return root;
}
}
