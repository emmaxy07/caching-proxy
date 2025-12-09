import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;

public class CachingProxy {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String url = "";
        String userInput = "";
        String portNumber = "3000";

        while(true){
            InetAddress localAddress = InetAddress.getByName("127.0.0.1");
            HttpServer server = HttpServer.create(new InetSocketAddress(localAddress, 3000), 0);

            HttpContext context = server.createContext("/", new MyHttpHandler());

            server.start();
            System.out.print("What is your url? ");
            url = scanner.nextLine();
            try {
                    new URI(url).parseServerAuthority();
                        System.out.println("valid url");
                    } catch (URISyntaxException e) {
                        System.out.println("invalid url");
                    }
            System.out.print("");
            if(userInput.equals("caching-proxy --port" + portNumber + "--origin" + url )){
                
            }
            

        scanner.close();
        }
    }
}