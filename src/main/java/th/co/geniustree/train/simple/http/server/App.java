/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.train.simple.http.server;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 *
 * @author moth
 */
public class App {
    public static void main(String[] arg) throws IOException{
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new SimpleHttpHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
