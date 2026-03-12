package http;

import java.net.URL;
import java.net.URLConnection;

public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, java.util.Map<String, Object> dados) {
        try {
            URL urlADaApi = new URL(url);
            URLConnection connection = urlADaApi.openConnection();
            connection.connect(); 
        } catch(Exception e) {
            throw new RuntimeException("URL inválida: " + url, e);
        }   

    }   
    
}
