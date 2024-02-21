package unowithfriends.proposal; 

import java.net.*;
import java.io.*;

//Reference: https://www.baeldung.com/a-guide-to-java-sockets
//creates socket server and connects to client server. 
public class Server1{
    private ServerSocket serverSocket1; 
    private Socket userSocket1; 
    private PrintWriter out;    //writes output to user 
    private BufferedReader in;  //reads input from user

    /* sends greeting to  */
    public void start(int port) throws IOException{
        serverSocket1 = new ServerSocket(port); //creates server socket 
        userSocket1 = serverSocket1.accept();   
        out = new PrintWriter(userSocket1.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(userSocket1.getInputStream()));   //gets input from user
        String greeting = in.readLine();
            if ("hello server".equals(greeting)) {
                out.println("hello client");
            }
            else {
                out.println("unrecognised greeting");
            }
    }

    public void stop() throws IOException{
        in.close();
        out.close();
        userSocket1.close();
        serverSocket1.close();
    }
    public static void main(String[] args) throws IOException {
        Server1 server=new Server1();
        server.start(6666); //NEED ACTUAL PORT
    }
}