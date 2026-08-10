import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleServer {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/", new Router());
        server.setExecutor(null);
        server.start();

        System.out.println("Server running at http://localhost:8000");
    }

    static class Router implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();

            // BASIC ROUTING
            switch (path) {
                case "/":
                    sendFile(exchange, "web/index.html");
                    break;

                case "/login":
                    sendFile(exchange, "web/login.html");
                    break;

                case "/register":
                    sendFile(exchange, "web/register.html");
                    break;

                default:
                    String notFound = "404 Not Found";
                    exchange.sendResponseHeaders(404, notFound.length());
                    exchange.getResponseBody().write(notFound.getBytes());
                    exchange.getResponseBody().close();
            }
        }
    }

    static void sendFile(HttpExchange exchange, String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of(filePath));
        exchange.sendResponseHeaders(200, bytes.length);
        OutputStream os = exchange.getResponseBody();
        os.write(bytes);
        os.close();
    }
}
