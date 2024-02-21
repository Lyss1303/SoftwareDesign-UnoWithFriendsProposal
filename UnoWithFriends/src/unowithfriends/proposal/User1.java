package unowithfriends.proposal; 

import java.net.*;
import java.io.*;

//Reference: 
public class User1 {
    private Socket userSocket1;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws IOException {
        userSocket1 = new Socket(ip, port);
        out = new PrintWriter(userSocket1.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(userSocket1.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException{
        out.println(msg);
        String resp = in.readLine();
        return resp;
    }

    public void stopConnection() throws IOException{
        in.close();
        out.close();
        userSocket1.close();
    }
}
