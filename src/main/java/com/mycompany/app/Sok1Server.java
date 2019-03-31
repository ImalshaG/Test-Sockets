package com.mycompany.app;

import java.io.*;
import java.net.*;

public class Sok1Server {
    public static void main(String[] args) throws Exception {
        Sok1Server server=new Sok1Server();
        server.run();

    }
    public void run() throws Exception{
        ServerSocket serverSock = new ServerSocket(444);
        Socket sock=serverSock.accept();
        InputStreamReader IR= new InputStreamReader(sock.getInputStream());
        BufferedReader BR=new BufferedReader(IR);

        String message=BR.readLine();
        System.out.println(message);
        if(message!=null){
            PrintStream PS=new PrintStream(sock.getOutputStream());
            PS.println("Message received");
        }
    }
}
