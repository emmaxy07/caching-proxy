import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

    public class MyHttpHandler implements HttpHandler{
        @Override
        public void handle(HttpExchange exchange) throws IOException{
            String response = "";

            exchange.sendResponseHeaders(200, response.length());

            try(OutputStream stream = exchange.getResponseBody()){
                stream.write(response.getBytes());
            }
        }
    }
