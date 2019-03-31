package com.mycompany.app;

import java.io.*;
import java.net.*;

public class Sok1Client {
    public static void main(String[] args) throws Exception{
        Sok1Client Client=new Sok1Client();
        Client.run();
    }

    public void run() throws Exception{
        Socket Sock=new Socket("localhost",444);
        PrintStream PS=new PrintStream(Sock.getOutputStream());
        PS.println("Hello to Server from Client");

        InputStreamReader IR=new InputStreamReader(Sock.getInputStream());
        BufferedReader BR=new BufferedReader(IR);

        String message = BR.readLine();
        System.out.println(message);
    }
}
