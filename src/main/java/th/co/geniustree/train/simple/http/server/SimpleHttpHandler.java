/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.train.simple.http.server;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.List;

/**
 *
 * @author moth
 */
public class SimpleHttpHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
        URI requestUrl = he.getRequestURI();
        String queryString = requestUrl.getQuery();
        String response = "You request me with query string ===> "+queryString;
        he.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = he.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

}
